package fiskfille.tf.client.displayable;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import fiskfille.tf.TransformersMod;
import fiskfille.tf.client.model.item.ModelSkystrikesCrossbow;

public class DisplayableSkystrikesCrossbow extends Displayable
{
	private ModelSkystrikesCrossbow model = new ModelSkystrikesCrossbow();
	
	@Override
	public void render(ItemStack itemstack)
	{
		bindTexture(new ResourceLocation(TransformersMod.modid, "textures/models/weapons/skystrikes_crossbow.png"));
				
		float f = 0.5F;
		float f1 = MathHelper.sin(((float)mc.thePlayer.ticksExisted) / 15.0F) * 0.1F;
		GL11.glScalef(f, f, f);
		GL11.glRotatef((float)mc.thePlayer.ticksExisted * 0.75F, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(0, 1.4F + f1, -0.0625F);
		GL11.glRotatef(-90, 1, 0, 0);
		
		model.render();
	}
}