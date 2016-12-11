package fiskfille.tf.client.model.transformer.vehicle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import fiskfille.tf.client.event.ClientEventHandler;
import fiskfille.tf.client.model.tools.ModelRendererTF;
import fiskfille.tf.common.motion.TFMotionManager;
import fiskfille.tf.common.motion.VehicleMotion;
import fiskfille.tf.helper.TFRenderHelper;

public class ModelSubwooferVehicle extends ModelVehicleBase
{
    public ModelRendererTF vehicleBase;
    public ModelRendererTF vehicleStomach;
    public ModelRendererTF vehicleCrotch1;
    public ModelRendererTF vehicleRear1;
    public ModelRendererTF vehicleRear2;
    public ModelRendererTF vehicleChestMain1;
    public ModelRendererTF vehicleFrontWheel1;
    public ModelRendererTF vehicleFrontWheel2;
    public ModelRendererTF vehicleFrontChest1;
    public ModelRendererTF vehicleFrontChest2;
    public ModelRendererTF vehicleChestMain2;
    public ModelRendererTF vehicleChestMain3;
    public ModelRendererTF vehicleChestMain5;
    public ModelRendererTF vehicleChestMain6;
    public ModelRendererTF vehicleDish1;
    public ModelRendererTF vehicleShoulderBase2;
    public ModelRendererTF vehicleShoulderBase1;
    public ModelRendererTF vehicleCover1;
    public ModelRendererTF vehicleCover2;
    public ModelRendererTF vehicleCover3;
    public ModelRendererTF vehicleCover4;
    public ModelRendererTF vehicleCover5;
    public ModelRendererTF vehicleCover6;
    public ModelRendererTF vehicleHood;
    public ModelRendererTF vehicleBaseplate;
    public ModelRendererTF vehicleAntenna1;
    public ModelRendererTF vehicleAntenna2;
    public ModelRendererTF vehicleDish2;
    public ModelRendererTF vehicleUpperArmL;
    public ModelRendererTF vehicleLowerArmL1;
    public ModelRendererTF vehicleUpperArmR;
    public ModelRendererTF vehicleLowerArmRL1;
    public ModelRendererTF vehicleBass2;
    public ModelRendererTF vehicleBass3;
    public ModelRendererTF vehicleFront1;
    public ModelRendererTF vehicleFront2;
    public ModelRendererTF vehicleUpperLegL;
    public ModelRendererTF vehicleUpperLegR;
    public ModelRendererTF vehicleLowerLegL1;
    public ModelRendererTF vehicleRearWheel2;
    public ModelRendererTF vehicleLowerLegL3;
    public ModelRendererTF vehicleLowerLegR1;
    public ModelRendererTF vehicleLowerLegR3;
    public ModelRendererTF vehicleRearWheel1;

    public ModelSubwooferVehicle()
    {
        textureWidth = 128;
        textureHeight = 128;
        vehicleCover6 = new ModelRendererTF(this, 17, 0);
        vehicleCover6.setRotationPoint(4.1F, -1.4F, -2.4F);
        vehicleCover6.addBox(-1, 0, 0, 1, 4, 9, 0);
        setRotateAngle(vehicleCover6, 0, 0, -0.017453292519943295F);
        vehicleLowerArmRL1 = new ModelRendererTF(this, 48, 94);
        vehicleLowerArmRL1.mirror = true;
        vehicleLowerArmRL1.setRotationPoint(1.4F, 4.5F, 0.6F);
        vehicleLowerArmRL1.addBox(-1.7F, -0.6F, -1.5F, 3, 5, 3, 0);
        vehicleChestMain1 = new ModelRendererTF(this, 0, 67);
        vehicleChestMain1.setRotationPoint(0, -2, 0);
        vehicleChestMain1.addBox(-4, -4, -3, 8, 4, 6, 0);
        setRotateAngle(vehicleChestMain1, -1.5707963267948966F, 0, 0);
        vehicleCover3 = new ModelRendererTF(this, 0, 0);
        vehicleCover3.mirror = true;
        vehicleCover3.setRotationPoint(-4.1F, -3.9F, -3.4F);
        vehicleCover3.addBox(0, 0, 0, 1, 3, 14, 0);
        vehicleRear1 = new ModelRendererTF(this, 0, 22);
        vehicleRear1.setRotationPoint(-4, -0.5F, 7);
        vehicleRear1.addBox(0, 0, 0, 8, 4, 2, 0);
        vehicleRear2 = new ModelRendererTF(this, 0, 29);
        vehicleRear2.setRotationPoint(-4, -2.5F, 8);
        vehicleRear2.addBox(0, -1, 0, 8, 3, 1, 0);
        vehicleFrontChest2 = new ModelRendererTF(this, 10, 77);
        vehicleFrontChest2.mirror = true;
        vehicleFrontChest2.setRotationPoint(4, -4, -3);
        vehicleFrontChest2.addBox(-4, 0, -0.6F, 4, 4, 1, 0);
        setRotateAngle(vehicleFrontChest2, -0.07330382858376185F, 0, 0.005235987755982988F);
        vehicleLowerLegL3 = new ModelRendererTF(this, 79, 82);
        vehicleLowerLegL3.setRotationPoint(0.7F, -1.5F, 2.5F);
        vehicleLowerLegL3.addBox(0, 0, 0, 1, 7, 2, 0);
        vehicleLowerLegR1 = new ModelRendererTF(this, 76, 66);
        vehicleLowerLegR1.mirror = true;
        vehicleLowerLegR1.setRotationPoint(-1.3F, 2.5F, -1);
        vehicleLowerLegR1.addBox(-1.7F, -1.5F, -1.5F, 3, 6, 4, 0);
        vehicleUpperLegL = new ModelRendererTF(this, 76, 58);
        vehicleUpperLegL.setRotationPoint(1, 1, 0);
        vehicleUpperLegL.addBox(0, -1, -2, 2, 5, 3, 0);
        setRotateAngle(vehicleUpperLegL, 1.5707963267948966F, 0, 0);
        vehicleBaseplate = new ModelRendererTF(this, 20, 2);
        vehicleBaseplate.setRotationPoint(-3, 1.6F, -5.4F);
        vehicleBaseplate.addBox(0, 0, 0, 6, 1, 16, 0);
        vehicleLowerArmL1 = new ModelRendererTF(this, 48, 94);
        vehicleLowerArmL1.setRotationPoint(-1.4F, 4.5F, 0.6F);
        vehicleLowerArmL1.addBox(-1.3F, -0.6F, -1.5F, 3, 5, 3, 0);
        vehicleFront2 = new ModelRendererTF(this, 0, 0);
        vehicleFront2.setRotationPoint(0, 0, 0);
        vehicleFront2.addBox(7, 0.4F, -2.8F, 1, 3, 1, 0);
        setRotateAngle(vehicleFront2, -0.13962634015954636F, 0, 0);
        vehicleUpperArmR = new ModelRendererTF(this, 61, 79);
        vehicleUpperArmR.setRotationPoint(-1.7F, 1, 0);
        vehicleUpperArmR.addBox(-1, -0.2F, -1, 2, 4, 2, 0);
        vehicleRearWheel2 = new ModelRendererTF(this, 0, 77);
        vehicleRearWheel2.setRotationPoint(0.2F, 4.4F, -0.5F);
        vehicleRearWheel2.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);
        vehicleDish2 = new ModelRendererTF(this, 22, 67);
        vehicleDish2.setRotationPoint(0, -3, 1);
        vehicleDish2.addBox(-2, -2, -1, 2, 2, 1, 0);
        setRotateAngle(vehicleDish2, 0.2792526803190927F, 0, 0);
        vehicleUpperLegR = new ModelRendererTF(this, 76, 58);
        vehicleUpperLegR.mirror = true;
        vehicleUpperLegR.setRotationPoint(-1, 1, 0);
        vehicleUpperLegR.addBox(-2, -1, -2, 2, 5, 3, 0);
        setRotateAngle(vehicleUpperLegR, 1.5707963267948966F, 0, 0);
        vehicleCover2 = new ModelRendererTF(this, 0, 42);
        vehicleCover2.setRotationPoint(-4, -4.5F, 3);
        vehicleCover2.addBox(0, 0, 0, 8, 1, 7, 0);
        vehicleBase = new ModelRendererTF(this, 0, 98);
        vehicleBase.setRotationPoint(0, 20, -0.5F);
        vehicleBase.addBox(-3.5F, 0, -2.5F, 7, 2, 5, 0);
        vehicleCover4 = new ModelRendererTF(this, 0, 0);
        vehicleCover4.setRotationPoint(4.1F, -3.9F, -3.4F);
        vehicleCover4.addBox(-1, 0, 0, 1, 3, 14, 0);
        setRotateAngle(vehicleCover4, 0.006283185307179587F, 0, 0);
        vehicleCover5 = new ModelRendererTF(this, 17, 0);
        vehicleCover5.mirror = true;
        vehicleCover5.setRotationPoint(-4.1F, -1.4F, -2.4F);
        vehicleCover5.addBox(0, 0, 0, 1, 4, 9, 0);
        setRotateAngle(vehicleCover5, 0, 0, 0.017453292519943295F);
        vehicleCrotch1 = new ModelRendererTF(this, 0, 105);
        vehicleCrotch1.setRotationPoint(0, 0, 0);
        vehicleCrotch1.addBox(-1, -0.7F, -2.4F, 2, 3, 4, 0);
        vehicleChestMain2 = new ModelRendererTF(this, 18, 62);
        vehicleChestMain2.setRotationPoint(-3, -0.6F, -6.1F);
        vehicleChestMain2.addBox(0, 0, 0.3F, 6, 3, 2, 0);
        setRotateAngle(vehicleChestMain2, 0.03490658503988659F, 0, 0);
        vehicleFrontWheel2 = new ModelRendererTF(this, 0, 77);
        vehicleFrontWheel2.mirror = true;
        vehicleFrontWheel2.setRotationPoint(2.5F, 1.5F, -3.7F);
        vehicleFrontWheel2.addBox(0, -1.5F, -1.5F, 2, 3, 3, 0);
        vehicleLowerLegR3 = new ModelRendererTF(this, 79, 82);
        vehicleLowerLegR3.mirror = true;
        vehicleLowerLegR3.setRotationPoint(-1.7F, -1.5F, 2.5F);
        vehicleLowerLegR3.addBox(0, 0, 0, 1, 7, 2, 0);
        vehicleChestMain3 = new ModelRendererTF(this, 0, 83);
        vehicleChestMain3.setRotationPoint(-3, -4, 3);
        vehicleChestMain3.addBox(0, 0, 0, 6, 4, 2, 0);
        vehicleDish1 = new ModelRendererTF(this, 0, 67);
        vehicleDish1.setRotationPoint(-4, -4.6F, 6.2F);
        vehicleDish1.addBox(-2, -3, 0, 2, 3, 1, 0);
        setRotateAngle(vehicleDish1, 0.017453292519943295F, 0.12217304763960307F, 1.5707963267948966F);
        vehicleShoulderBase1 = new ModelRendererTF(this, 48, 78);
        vehicleShoulderBase1.setRotationPoint(-1, -1.9F, 0);
        vehicleShoulderBase1.addBox(-2.9F, -1, -1.4F, 3, 2, 3, 0);
        setRotateAngle(vehicleShoulderBase1, 1.5707963267948966F, 0, 0);
        vehicleUpperArmL = new ModelRendererTF(this, 61, 79);
        vehicleUpperArmL.setRotationPoint(1.7F, 1, 0);
        vehicleUpperArmL.addBox(-1, -0.2F, -1, 2, 4, 2, 0);
        vehicleCover1 = new ModelRendererTF(this, 0, 34);
        vehicleCover1.setRotationPoint(-3, -4.5F, 3);
        vehicleCover1.addBox(0, 0, -6, 6, 1, 6, 0);
        setRotateAngle(vehicleCover1, 0.08203047484373349F, 0, 0);
        vehicleAntenna1 = new ModelRendererTF(this, 30, 67);
        vehicleAntenna1.setRotationPoint(0, 1.1F, 6);
        vehicleAntenna1.addBox(-0.5F, -6, -0.5F, 1, 6, 1, 0);
        setRotateAngle(vehicleAntenna1, -0.05235987755982988F, 0, 0);
        vehicleFront1 = new ModelRendererTF(this, 0, 0);
        vehicleFront1.mirror = true;
        vehicleFront1.setRotationPoint(0, 0, 0);
        vehicleFront1.addBox(0, 0.4F, -2.8F, 1, 3, 1, 0);
        setRotateAngle(vehicleFront1, -0.13962634015954636F, 0, 0);
        vehicleChestMain5 = new ModelRendererTF(this, 0, 89);
        vehicleChestMain5.setRotationPoint(2.9F, 0.5F, 3);
        vehicleChestMain5.addBox(-1, -2, 0, 2, 3, 4, 0);
        setRotateAngle(vehicleChestMain5, 3.141592653589793F, 0, 0);
        vehicleHood = new ModelRendererTF(this, 0, 18);
        vehicleHood.setRotationPoint(-4, -1, -3);
        vehicleHood.addBox(0, 0, -2.8F, 8, 1, 3, 0);
        setRotateAngle(vehicleHood, 0.13962634015954636F, 0, 0);
        vehicleStomach = new ModelRendererTF(this, 0, 58);
        vehicleStomach.setRotationPoint(0, 1, 0);
        vehicleStomach.addBox(-2.5F, -5.5F, -2, 5, 5, 4, 0);
        setRotateAngle(vehicleStomach, 1.5707963267948966F, 0, 0);
        vehicleFrontChest1 = new ModelRendererTF(this, 10, 77);
        vehicleFrontChest1.setRotationPoint(-4, -4, -3);
        vehicleFrontChest1.addBox(0, 0, -0.6F, 4, 4, 1, 0);
        setRotateAngle(vehicleFrontChest1, -0.07330382858376185F, 0, -0.005235987755982988F);
        vehicleBass3 = new ModelRendererTF(this, 0, 112);
        vehicleBass3.mirror = true;
        vehicleBass3.setRotationPoint(-2.5F, -2.5F, 2.1F);
        vehicleBass3.addBox(0, 0, 0, 1, 4, 3, 0);
        setRotateAngle(vehicleBass3, 0, 1.5707963267948966F, 0);
        vehicleFrontWheel1 = new ModelRendererTF(this, 0, 77);
        vehicleFrontWheel1.setRotationPoint(-2.5F, 1.5F, -3.7F);
        vehicleFrontWheel1.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);
        vehicleAntenna2 = new ModelRendererTF(this, 30, 67);
        vehicleAntenna2.setRotationPoint(6, 1.1F, 6);
        vehicleAntenna2.addBox(-0.5F, -7, -0.5F, 1, 7, 1, 0);
        setRotateAngle(vehicleAntenna2, -0.05235987755982988F, 0, 0);
        vehicleLowerLegL1 = new ModelRendererTF(this, 76, 66);
        vehicleLowerLegL1.setRotationPoint(1.3F, 2.5F, -1);
        vehicleLowerLegL1.addBox(-1.3F, -1.5F, -1.5F, 3, 6, 4, 0);
        setRotateAngle(vehicleLowerLegL1, 0, 0.004886921905584123F, 0);
        vehicleBass2 = new ModelRendererTF(this, 0, 112);
        vehicleBass2.setRotationPoint(1.7F, -2.5F, 2.1F);
        vehicleBass2.addBox(0, 0, 0, 1, 4, 3, 0);
        setRotateAngle(vehicleBass2, 0, 1.5707963267948966F, 0);
        vehicleChestMain6 = new ModelRendererTF(this, 0, 89);
        vehicleChestMain6.mirror = true;
        vehicleChestMain6.setRotationPoint(-2.9F, 0.5F, 3);
        vehicleChestMain6.addBox(-1, -2, 0, 2, 3, 4, 0);
        setRotateAngle(vehicleChestMain6, 3.141592653589793F, 0, 0);
        vehicleShoulderBase2 = new ModelRendererTF(this, 48, 78);
        vehicleShoulderBase2.setRotationPoint(1, -1.9F, 0);
        vehicleShoulderBase2.addBox(-0.1F, -1, -1.4F, 3, 2, 3, 0);
        setRotateAngle(vehicleShoulderBase2, 1.5707963267948966F, 0, 0);
        vehicleRearWheel1 = new ModelRendererTF(this, 0, 77);
        vehicleRearWheel1.mirror = true;
        vehicleRearWheel1.setRotationPoint(-0.2F, 4.4F, -0.5F);
        vehicleRearWheel1.addBox(-2, -1.5F, -1.5F, 2, 3, 3, 0);
        vehicleChestMain1.addChild(vehicleCover6);
        vehicleUpperArmR.addChild(vehicleLowerArmRL1);
        vehicleStomach.addChild(vehicleChestMain1);
        vehicleChestMain1.addChild(vehicleCover3);
        vehicleBase.addChild(vehicleRear1);
        vehicleBase.addChild(vehicleRear2);
        vehicleChestMain1.addChild(vehicleFrontChest2);
        vehicleLowerLegL1.addChild(vehicleLowerLegL3);
        vehicleUpperLegR.addChild(vehicleLowerLegR1);
        vehicleCrotch1.addChild(vehicleUpperLegL);
        vehicleChestMain1.addChild(vehicleBaseplate);
        vehicleUpperArmL.addChild(vehicleLowerArmL1);
        vehicleHood.addChild(vehicleFront2);
        vehicleShoulderBase1.addChild(vehicleUpperArmR);
        vehicleLowerLegL1.addChild(vehicleRearWheel2);
        vehicleDish1.addChild(vehicleDish2);
        vehicleCrotch1.addChild(vehicleUpperLegR);
        vehicleChestMain1.addChild(vehicleCover2);
        vehicleChestMain1.addChild(vehicleCover4);
        vehicleChestMain1.addChild(vehicleCover5);
        vehicleBase.addChild(vehicleCrotch1);
        vehicleChestMain1.addChild(vehicleChestMain2);
        vehicleChestMain1.addChild(vehicleFrontWheel2);
        vehicleLowerLegR1.addChild(vehicleLowerLegR3);
        vehicleChestMain1.addChild(vehicleChestMain3);
        vehicleChestMain1.addChild(vehicleDish1);
        vehicleChestMain1.addChild(vehicleShoulderBase1);
        vehicleShoulderBase2.addChild(vehicleUpperArmL);
        vehicleChestMain1.addChild(vehicleCover1);
        vehicleChestMain3.addChild(vehicleAntenna1);
        vehicleHood.addChild(vehicleFront1);
        vehicleChestMain1.addChild(vehicleChestMain5);
        vehicleChestMain1.addChild(vehicleHood);
        vehicleBase.addChild(vehicleStomach);
        vehicleChestMain1.addChild(vehicleFrontChest1);
        vehicleLowerArmRL1.addChild(vehicleBass3);
        vehicleChestMain1.addChild(vehicleFrontWheel1);
        vehicleChestMain3.addChild(vehicleAntenna2);
        vehicleUpperLegL.addChild(vehicleLowerLegL1);
        vehicleLowerArmRL1.addChild(vehicleBass2);
        vehicleChestMain1.addChild(vehicleChestMain6);
        vehicleChestMain1.addChild(vehicleShoulderBase2);
        vehicleLowerLegR1.addChild(vehicleRearWheel1);

        setInitPose();
    }

    @Override
    public void render(EntityPlayer player, ItemStack itemstack, boolean hasLightsLayer)
    {
        TFRenderHelper.setupRenderLayers(itemstack, vehicleBase, hasLightsLayer);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, float scale, Entity entity)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, scale, entity);
        setToInitPose();

        if (entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) entity;
            VehicleMotion transformedPlayer = TFMotionManager.getTransformerPlayer(player);

            if (transformedPlayer != null)
            {
                float wheelSpinSpeed = (transformedPlayer.getForwardVelocity() < 0 ? -limbSwing : limbSwing) * 0.8F;

                for (ModelRenderer modelRenderer : new ModelRenderer[] {vehicleFrontWheel1, vehicleFrontWheel2, vehicleRearWheel1, vehicleRearWheel2})
                {
                    modelRenderer.rotateAngleX = wheelSpinSpeed;
                }
            }

            vehicleBase.rotateAngleX = -(float) (TFRenderHelper.getMotionY(player) + (player == Minecraft.getMinecraft().thePlayer && player.onGround ? 0.0784000015258789 : 0));
            vehicleBase.rotateAngleY = -(float) Math.toRadians(TFRenderHelper.median(player.renderYawOffset - player.rotationYaw, player.prevRenderYawOffset - player.prevRotationYaw, ClientEventHandler.renderTick));
        }
    }
}
