package fiskfille.tf.client.gui;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.util.Vec3;

import org.lwjgl.opengl.GL11;

import com.google.common.collect.Lists;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fiskfille.tf.common.energon.power.IEnergyReceiver;
import fiskfille.tf.common.energon.power.IEnergyTransmitter;
import fiskfille.tf.common.network.MessageSetReceivers;
import fiskfille.tf.common.network.base.TFNetworkManager;
import fiskfille.tf.helper.TFEnergyHelper;
import fiskfille.tf.helper.TFRenderHelper;

@SideOnly(Side.CLIENT)
public class GuiSelectReceivers extends GuiScreen
{
    public TileEntity tile;
    public IEnergyTransmitter transmitter;

    public Set<ChunkCoordinates> receiverCoords = new HashSet<ChunkCoordinates>();
    public ChunkCoordinates[] coordArray;
    public List<Integer> layers = Lists.newArrayList();

    public GuiVerticalHeightSlider heightSlider;

    public int spacing = 1;
    public int size = 3;

    @Override
    public void initGui()
    {
        super.initGui();
        float range = transmitter.getRange();
        float boardWidth = 1 + range * 2;
        int boardWidthFl = MathHelper.floor_float(boardWidth);
        int baseX = MathHelper.floor_double(width / 2 - (spacing + size) * boardWidth / 2);
        int baseY = MathHelper.floor_double(height / 2 - (spacing + size) * boardWidth / 2);

        buttonList.add(new GuiButton(0, width / 2 - 100, height - height / 7, StatCollector.translateToLocal("gui.done")));
        buttonList.add(heightSlider = new GuiVerticalHeightSlider(1, this, baseX + boardWidthFl * (spacing + size), baseY - 1, boardWidthFl * (spacing + size) + 1));
    }

    public GuiSelectReceivers(TileEntity tile)
    {
        this.tile = tile;
        transmitter = (IEnergyTransmitter) tile;
        receiverCoords.addAll(transmitter.getTransmissionHandler().getReceiverCoords());
    }

    @Override
    public void updateScreen()
    {
        int boardWidth = 1 + getRange() * 2;
        coordArray = new ChunkCoordinates[boardWidth * boardWidth];
        layers.clear();
        layers.add(tile.yCoord);

        for (TileEntity tile : (List<TileEntity>) mc.theWorld.loadedTileEntityList)
        {
            if (tile instanceof IEnergyReceiver && ((IEnergyReceiver) tile).canReceiveEnergy(this.tile) && TFEnergyHelper.isInRange(this.tile, tile))
            {
                if (!layers.contains(tile.yCoord))
                {
                    layers.add(tile.yCoord);
                }
            }
        }

        Collections.sort(layers);

        for (int i = 0; i < boardWidth; ++i)
        {
            for (int j = 0; j < boardWidth; ++j)
            {
                int x = MathHelper.floor_double(tile.xCoord - boardWidth / 2 + i);
                int z = MathHelper.floor_double(tile.zCoord - boardWidth / 2 + j);
                ChunkCoordinates coords = new ChunkCoordinates(x, getLayer(), z);

                if (TFEnergyHelper.isInRange(tile, coords))
                {
                    coordArray[i + j * boardWidth] = coords;
                }
            }
        }

        int direction = MathHelper.floor_double((double) ((mc.thePlayer.rotationYaw * 4F) / 360F) + 2.5D) & 3;

        if (direction > 0)
        {
            ChunkCoordinates[] coordArray1 = coordArray.clone();

            for (int i = 0; i < boardWidth; ++i)
            {
                for (int j = 0; j < boardWidth; ++j)
                {
                    ChunkCoordinates coords = coordArray[i + j * boardWidth];

                    if (direction == 1)
                    {
                        coords = coordArray[(boardWidth - 1 - j) + i * boardWidth];
                    }
                    else if (direction == 2)
                    {
                        coords = coordArray[(boardWidth - 1 - i) + (boardWidth - 1 - j) * boardWidth];
                    }
                    else if (direction == 3)
                    {
                        coords = coordArray[j + (boardWidth - 1 - i) * boardWidth];
                    }

                    coordArray1[i + j * boardWidth] = coords;
                }
            }

            coordArray = coordArray1;
        }

        heightSlider.enabled = layers.size() > 1;
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        int id = button.id;

        if (id == 0)
        {
            mc.thePlayer.closeScreen();
        }
    }

    @Override
    protected void keyTyped(char c, int key)
    {
        if (key == 1 || key == mc.gameSettings.keyBindInventory.getKeyCode())
        {
            mc.thePlayer.closeScreen();
        }
    }

    @Override
    public void onGuiClosed()
    {
        TFNetworkManager.networkWrapper.sendToServer(new MessageSetReceivers(tile.xCoord, tile.yCoord, tile.zCoord, receiverCoords));
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int button)
    {
        super.mouseClicked(mouseX, mouseY, button);

        if (button == 0)
        {
            int boardWidth = 1 + getRange() * 2;
            int baseX = MathHelper.floor_double(width / 2 - (spacing + size) * boardWidth / 2);
            int baseY = MathHelper.floor_double(height / 2 - (spacing + size) * boardWidth / 2);

            if (coordArray != null)
            {
                for (int i = 0; i < boardWidth; ++i)
                {
                    for (int j = 0; j < boardWidth; ++j)
                    {
                        int x = baseX + (spacing + size) * i;
                        int y = baseY + (spacing + size) * j;

                        if (mouseX >= x && mouseX < x + size && mouseY >= y && mouseY < y + size)
                        {
                            ChunkCoordinates coords = coordArray[i + j * boardWidth];

                            if (coords != null)
                            {
                                TileEntity tile = mc.theWorld.getTileEntity(coords.posX, coords.posY, coords.posZ);

                                if (tile != this.tile && tile instanceof IEnergyReceiver && ((IEnergyReceiver) tile).canReceiveEnergy(this.tile) && (!(tile instanceof IEnergyTransmitter) || !TFEnergyHelper.isGrandParentTo(tile, this.tile)))
                                {
                                    if (receiverCoords.contains(coords))
                                    {
                                        receiverCoords.remove(coords);
                                    }
                                    else
                                    {
                                        receiverCoords.add(coords);
                                    }

                                    mc.getSoundHandler().playSound(PositionedSoundRecord.func_147674_a(new ResourceLocation("gui.button.press"), 1));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int getLayer()
    {
        float f = 1 - heightSlider.percentage;
        int amount = layers.size() - 1;

        for (int i = 0; i < layers.size(); ++i)
        {
            if (f >= (i - 0.5F) / amount && f < (i + 0.5F) / amount)
            {
                return layers.get(i);
            }
        }

        return 4;
    }

    public int getRange()
    {
        return MathHelper.floor_float(transmitter.getRange());
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        drawDefaultBackground();
        drawCenteredString(fontRendererObj, StatCollector.translateToLocal("gui.transmitter.select_receivers"), width / 2, 15, 16777215);

        if (coordArray == null || layers.isEmpty())
        {
            updateScreen();
        }

        int boardWidth = 1 + getRange() * 2;
        int baseX = MathHelper.floor_double(width / 2 - (spacing + size) * boardWidth / 2);
        int baseY = MathHelper.floor_double(height / 2 - (spacing + size) * boardWidth / 2);

        if (coordArray != null)
        {
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921569F);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

            GL11.glColor4f(0.1F, 0.1F, 0.1F, 1);
            drawTexturedModalRect(baseX - spacing, baseY - spacing, 0, 0, MathHelper.floor_float((spacing + size) * boardWidth) + spacing, MathHelper.floor_float((spacing + size) * boardWidth) + spacing);
            Vec3 src = Vec3.createVectorHelper(size * getRange() - 0.5F, size * getRange() - 0.5F, 0);

            int maxWidth = 0;

            for (int i = 0; i < boardWidth; ++i)
            {
                for (int j = 0; j < boardWidth; ++j)
                {
                    ChunkCoordinates coords = coordArray[i + j * boardWidth];

                    if (coords != null)
                    {
                        Vec3 src1 = Vec3.createVectorHelper(tile.xCoord + 0.5F, 0, tile.zCoord + 0.5F);
                        Vec3 dst = Vec3.createVectorHelper(coords.posX + 0.5F, 0, coords.posZ + 0.5F);
                        maxWidth = Math.max(maxWidth, MathHelper.floor_double(src1.distanceTo(dst)));
                    }
                }
            }

            maxWidth = 1 + maxWidth * 2;

            for (int i = 0; i < boardWidth; ++i)
            {
                for (int j = 0; j < boardWidth; ++j)
                {
                    Vec3 dst = Vec3.createVectorHelper(size * i, size * j, 0);
                    float opacity = MathHelper.clamp_float((1 - (float) src.distanceTo(dst) / maxWidth * 2 / size) * 2.5F, 0, 1);
                    int x = baseX + (spacing + size) * i;
                    int y = baseY + (spacing + size) * j;

                    GL11.glColor4f(0.075F, 0.075F, 0.075F, 1);
                    drawTexturedModalRect(x, y, 0, 0, size, size);

                    ChunkCoordinates coords = coordArray[i + j * boardWidth];

                    if (coords != null)
                    {
                        Block block = mc.theWorld.getBlock(coords.posX, coords.posY, coords.posZ);
                        int metadata = mc.theWorld.getBlockMetadata(coords.posX, coords.posY, coords.posZ);

                        if (!mc.theWorld.isAirBlock(coords.posX, coords.posY, coords.posZ))
                        {
//                            MapColor color = block.getMapColor(metadata);
//                            float[] afloat = TFRenderHelper.hexToRGB(color.colorValue);
                            float[] afloat = TFRenderHelper.hexToRGB(0x707070);

                            GL11.glColor4f(afloat[0], afloat[1], afloat[2], opacity);
                            drawTexturedModalRect(x, y, 0, 0, size, size);
                        }
                    }
                }
            }

            Tessellator tessellator = Tessellator.instance;
            float prevWidth = GL11.glGetFloat(GL11.GL_LINE_WIDTH);
            GL11.glLineWidth(size);
            GL11.glColor4f(0, 1, 1, 1);

            for (int i = 0; i < boardWidth; ++i)
            {
                for (int j = 0; j < boardWidth; ++j)
                {
                    ChunkCoordinates coords = coordArray[i + j * boardWidth];
                    int x = baseX + (spacing + size) * i;
                    int y = baseY + (spacing + size) * j;

                    if (receiverCoords.contains(coords))
                    {
                        tessellator.startDrawing(3);
                        tessellator.addVertex(x + (float) size / 2, y + (float) size / 2, 0);
                        tessellator.addVertex(baseX + (spacing + size) * boardWidth / 2 - 0.5F, baseY + (spacing + size) * boardWidth / 2 - 0.5F, 0);
                        tessellator.draw();
                    }
                }
            }

            for (int i = 0; i < boardWidth; ++i)
            {
                for (int j = 0; j < boardWidth; ++j)
                {
                    Vec3 dst = Vec3.createVectorHelper(size * i, size * j, 0);
                    float opacity = MathHelper.clamp_float((1 - (float) src.distanceTo(dst) / boardWidth * 2 / size) * 2.5F, 0, 1);
                    int x = baseX + (spacing + size) * i;
                    int y = baseY + (spacing + size) * j;
                    ChunkCoordinates coords = coordArray[i + j * boardWidth];

                    if (coords != null)
                    {
                        TileEntity tile = mc.theWorld.getTileEntity(coords.posX, coords.posY, coords.posZ);

                        if (receiverCoords.contains(coords) && spacing > 0)
                        {
                            GL11.glColor4f(0, 1, 1, opacity);
                            drawTexturedModalRect(x - spacing, y - spacing, 0, 0, size + spacing * 2, size + spacing * 2);
                        }

                        if (tile == this.tile)
                        {
                            GL11.glColor4f(0, 0.6F, 0, opacity);
                        }
                        else if (tile instanceof IEnergyTransmitter && tile instanceof IEnergyReceiver && ((IEnergyReceiver) tile).canReceiveEnergy(this.tile))
                        {
                            if (((IEnergyTransmitter) tile).isPowering(this.tile))
                            {
                                GL11.glColor4f(0.2F, 0, 0.4F, opacity);
                            }
                            else
                            {
                                GL11.glColor4f(0.75F, 0, 0.75F, opacity);
                            }
                        }
                        else if (tile instanceof IEnergyReceiver && ((IEnergyReceiver) tile).canReceiveEnergy(this.tile))
                        {
                            GL11.glColor4f(1, 0, 0, opacity);
                        }
                        else if (tile instanceof IEnergyTransmitter && TFEnergyHelper.isGrandParentTo(tile, this.tile))
                        {
                            GL11.glColor4f(0.2F, 0, 0.2F, opacity);
                        }
                        else
                        {
                            continue;
                        }

                        drawTexturedModalRect(x, y, 0, 0, size, size);
                    }
                }
            }

            GL11.glLineWidth(prevWidth);
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
        }

        if (layers.size() > 1)
        {
            for (int i = 0; i < layers.size(); i += layers.size() - 1)
            {
                float f = (float)i / (layers.size() - 1);
                drawString(mc.fontRenderer, layers.get(i) + "", heightSlider.xPosition + heightSlider.width + 3, heightSlider.yPosition + (int) ((1 - f) * (float) (heightSlider.height - 8)), 0x4C4C4C);
            }
        }

        super.drawScreen(mouseX, mouseY, partialTicks);

        int direction = MathHelper.floor_double((double) ((mc.thePlayer.rotationYaw * 4F) / 360F) + 2.5D) & 3;
        String[] astring = {"north", "east", "south", "west"};
        String[] dirs = new String[astring.length];

        for (int i = 0; i < astring.length; ++i)
        {
            dirs[i] = StatCollector.translateToLocal("ground_bridge.direction." + astring[(i + direction) % astring.length]);
        }

        drawCenteredString(fontRendererObj, dirs[0], baseX + (spacing + size) * boardWidth / 2, baseY - fontRendererObj.FONT_HEIGHT / 2, -1);
        drawCenteredString(fontRendererObj, dirs[1], baseX + (spacing + size) * boardWidth, baseY + (spacing + size) * boardWidth / 2 - fontRendererObj.FONT_HEIGHT / 2, -1);
        drawCenteredString(fontRendererObj, dirs[2], baseX + (spacing + size) * boardWidth / 2, baseY + (spacing + size) * boardWidth - fontRendererObj.FONT_HEIGHT / 2, -1);
        drawCenteredString(fontRendererObj, dirs[3], baseX, baseY + (spacing + size) * boardWidth / 2 - fontRendererObj.FONT_HEIGHT / 2, -1);
    }
}