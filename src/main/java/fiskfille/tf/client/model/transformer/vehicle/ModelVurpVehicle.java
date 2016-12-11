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

public class ModelVurpVehicle extends ModelVehicleBase
{
    public ModelRendererTF vehicleBase;
    public ModelRendererTF vehicleWaist1;
    public ModelRendererTF vehicleWaist2;
    public ModelRendererTF vehicleWaistConnector1;
    public ModelRendererTF vehicleTorsoconnector1;
    public ModelRendererTF vehicleUpperlegR1;
    public ModelRendererTF vehicleUpperlegL1;
    public ModelRendererTF vehicleRplate1;
    public ModelRendererTF vehicleLplate1;
    public ModelRendererTF vehicleRearplate;
    public ModelRendererTF vehicleUpperlegR2;
    public ModelRendererTF vehicleKneeR1;
    public ModelRendererTF vehicleLowerlegR1;
    public ModelRendererTF vehiclelowerlegR7;
    public ModelRendererTF vehicleLowerlegR4;
    public ModelRendererTF vehicleLowerlegR5;
    public ModelRendererTF vehicleWheelBackR;
    public ModelRendererTF vehicleupperlegL2;
    public ModelRendererTF vehiclekneeL2;
    public ModelRendererTF vehiclelowerlegL1;
    public ModelRendererTF vehiclelowerlegL7;
    public ModelRendererTF vehiclelowerlegL4;
    public ModelRendererTF vehiclelowerlegL5;
    public ModelRendererTF vehicleWheelBackL;
    public ModelRendererTF vehicletorsobase;
    public ModelRendererTF vehiclehood1;
    public ModelRendererTF vehiclefrontR1;
    public ModelRendererTF vehiclefrontL1;
    public ModelRendererTF vehiclebackplate1;
    public ModelRendererTF vehiclebackplate2;
    public ModelRendererTF vehicleWheelR;
    public ModelRendererTF vehicleWheelL;
    public ModelRendererTF vehiclearmbaseR1;
    public ModelRendererTF vehiclearmbaseL1;
    public ModelRendererTF vehiclewindow1;
    public ModelRendererTF vehiclebaseplate;
    public ModelRendererTF vehiclehood2;
    public ModelRendererTF vehiclehood3;
    public ModelRendererTF vehiclehood4;
    public ModelRendererTF vehiclefrontR2;
    public ModelRendererTF vehiclefrontL2;
    public ModelRendererTF vehicleupperarmR1;
    public ModelRendererTF vehicleshoulderL1;
    public ModelRendererTF vehiclelowerarmR1;
    public ModelRendererTF vehiclelowerarmR2;
    public ModelRendererTF vehicleUpperarmL1;
    public ModelRendererTF vehicleshoulderL1_1;
    public ModelRendererTF vehicleLowerarmL1;
    public ModelRendererTF vehicleLowerarmL2;
    public ModelRendererTF vehicleWindow2;
    public ModelRendererTF vehiclerear1;
    public ModelRendererTF vehicleRear2;

    public ModelVurpVehicle()
    {
        textureWidth = 128;
        textureHeight = 128;

        vehiclebackplate2 = new ModelRendererTF(this, 51, 74);
        vehiclebackplate2.mirror = true;
        vehiclebackplate2.setRotationPoint(-2.3F, -1.8F, 1.8F);
        vehiclebackplate2.addBox(-3, -2, 0, 3, 5, 1);
        setRotateAngle(vehiclebackplate2, 1.5882496193148399F, 0.017453292519943295F, -1.5707963267948966F);
        vehicleWaistConnector1 = new ModelRendererTF(this, 4, 64);
        vehicleWaistConnector1.setRotationPoint(0, 2, -1);
        vehicleWaistConnector1.addBox(-1, -0.1F, -2.3F, 2, 3, 4);
        setRotateAngle(vehicleWaistConnector1, 1.5707963267948966F, 0, 0);
        vehiclewindow1 = new ModelRendererTF(this, 0, 7);
        vehiclewindow1.setRotationPoint(0, -1.9F, -1.2F);
        vehiclewindow1.addBox(-2.5F, -0.2F, 0, 5, 2, 3);
        setRotateAngle(vehiclewindow1, 0.33161255787892263F, 0, 0);
        vehicleLowerlegR1 = new ModelRendererTF(this, 0, 77);
        vehicleLowerlegR1.setRotationPoint(-0.8F, 2, 1.5F);
        vehicleLowerlegR1.addBox(-1.5F, 0, 0, 3, 6, 2);
        setRotateAngle(vehicleLowerlegR1, 3.141592653589793F, 0, -0.017453292519943295F);
        vehiclelowerlegL1 = new ModelRendererTF(this, 0, 77);
        vehiclelowerlegL1.mirror = true;
        vehiclelowerlegL1.setRotationPoint(0.8F, 2, 1.5F);
        vehiclelowerlegL1.addBox(-1.5F, 0, 0, 3, 6, 2);
        setRotateAngle(vehiclelowerlegL1, 3.141592653589793F, 0, 0.017453292519943295F);
        vehicleLowerarmL1 = new ModelRendererTF(this, 64, 65);
        vehicleLowerarmL1.setRotationPoint(0, 3.3F, 0.4F);
        vehicleLowerarmL1.addBox(-1.1F, -0.2F, -1.6F, 2, 4, 3);
        setRotateAngle(vehicleLowerarmL1, -3.141592653589793F, 0, 0);
        vehiclefrontL2 = new ModelRendererTF(this, 48, 70);
        vehiclefrontL2.mirror = true;
        vehiclefrontL2.setRotationPoint(0, 0, 0);
        vehiclefrontL2.addBox(-0.5F, -2, -3.7F, 2, 1, 3);
        setRotateAngle(vehiclefrontL2, 0.24434609527920614F, 0, 0.017453292519943295F);
        vehicleWaist2 = new ModelRendererTF(this, 0, 64);
        vehicleWaist2.setRotationPoint(0, 7, 1.5F);
        vehicleWaist2.addBox(-3, 0, 0, 3, 2, 1);
        setRotateAngle(vehicleWaist2, -1.5707963267948966F, 0, -3.211405823669566F);
        vehicleupperarmR1 = new ModelRendererTF(this, 74, 60);
        vehicleupperarmR1.setRotationPoint(-1.5F, 0, 1);
        vehicleupperarmR1.addBox(0, 0.8F, -0.5F, 1, 3, 1);
        setRotateAngle(vehicleupperarmR1, 1.5707963267948966F, 0, 0);
        vehiclehood3 = new ModelRendererTF(this, 47, 65);
        vehiclehood3.setRotationPoint(0, 0, 0);
        vehiclehood3.addBox(-1.8F, -3.3F, -1, 1, 4, 1);
        setRotateAngle(vehiclehood3, -0.005235987755982988F, 0.003490658503988659F, -0.22165681500327983F);
        vehicleTorsoconnector1 = new ModelRendererTF(this, 35, 60);
        vehicleTorsoconnector1.setRotationPoint(0, 0.1F, -0.4F);
        vehicleTorsoconnector1.addBox(-1.2F, -4, -0.8F, 2, 4, 2);
        setRotateAngle(vehicleTorsoconnector1, 0, 0.7853981633974483F, 0);
        vehiclelowerlegL5 = new ModelRendererTF(this, 16, 75);
        vehiclelowerlegL5.mirror = true;
        vehiclelowerlegL5.setRotationPoint(1.4F, 0, 0);
        vehiclelowerlegL5.addBox(-1, 0, 0, 1, 6, 1);
        setRotateAngle(vehiclelowerlegL5, -0.15707963267948966F, 0.06981317007977318F, 0.05235987755982988F);
        vehiclehood2 = new ModelRendererTF(this, 47, 65);
        vehiclehood2.setRotationPoint(0, 0, 0);
        vehiclehood2.addBox(0.8F, -3.3F, -1, 1, 4, 1);
        setRotateAngle(vehiclehood2, -0.005235987755982988F, 0.003490658503988659F, 0.22165681500327983F);
        vehicleLowerlegR5 = new ModelRendererTF(this, 16, 75);
        vehicleLowerlegR5.setRotationPoint(-1.4F, 0, 0);
        vehicleLowerlegR5.addBox(0, 0, 0, 1, 6, 1);
        setRotateAngle(vehicleLowerlegR5, -0.15707963267948966F, -0.06981317007977318F, -0.05235987755982988F);
        vehiclelowerlegL4 = new ModelRendererTF(this, 8, 83);
        vehiclelowerlegL4.setRotationPoint(-0.3F, 2.5F, 0.9F);
        vehiclelowerlegL4.addBox(-0.5F, -2, -2, 1, 3, 2);
        setRotateAngle(vehiclelowerlegL4, 0.15707963267948966F, -0.10471975511965977F, 0.08726646259971647F);
        vehiclehood4 = new ModelRendererTF(this, 51, 65);
        vehiclehood4.setRotationPoint(0, -0.2F, 0);
        vehiclehood4.addBox(-1.5F, -0.7F, -1.4F, 3, 2, 1);
        setRotateAngle(vehiclehood4, 1.3526301702956054F, 0, 0);
        vehicleWindow2 = new ModelRendererTF(this, 0, 24);
        vehicleWindow2.setRotationPoint(0, -0.2F, 3);
        vehicleWindow2.addBox(-2.5F, 0, 0, 5, 1, 2);
        setRotateAngle(vehicleWindow2, -0.20943951023931953F, 0, 0);
        vehiclelowerlegR7 = new ModelRendererTF(this, 14, 85);
        vehiclelowerlegR7.setRotationPoint(0.5F, 1, 1.6F);
        vehiclelowerlegR7.addBox(-2.4F, -0.5F, -1, 3, 2, 1);
        setRotateAngle(vehiclelowerlegR7, 0.6108652381980153F, -0.05235987755982988F, 0);
        vehiclelowerarmR2 = new ModelRendererTF(this, 74, 68);
        vehiclelowerarmR2.setRotationPoint(-1.5F, 3.5F, 0);
        vehiclelowerarmR2.addBox(0, -3, -1.9F, 1, 3, 2);
        setRotateAngle(vehiclelowerarmR2, 0.03490658503988659F, -0.2617993877991494F, -0.10122909661567112F);
        vehicleRplate1 = new ModelRendererTF(this, 0, 17);
        vehicleRplate1.setRotationPoint(0, 0.4F, 0.3F);
        vehicleRplate1.addBox(-3.4F, -0.9F, -5.2F, 3, 1, 6);
        setRotateAngle(vehicleRplate1, 0.061086523819801536F, 0.05235987755982988F, -0.017453292519943295F);
        vehiclefrontL1 = new ModelRendererTF(this, 35, 77);
        vehiclefrontL1.mirror = true;
        vehiclefrontL1.setRotationPoint(1.8F, -0.1F, -0.9F);
        vehiclefrontL1.addBox(-0.5F, -1, -4, 2, 2, 3);
        vehiclebaseplate = new ModelRendererTF(this, 13, 0);
        vehiclebaseplate.setRotationPoint(-2.5F, 0.1F, -4.5F);
        vehiclebaseplate.addBox(0, 0, 0, 5, 1, 13);
        vehiclebackplate1 = new ModelRendererTF(this, 51, 74);
        vehiclebackplate1.setRotationPoint(2.3F, -1.8F, 1.8F);
        vehiclebackplate1.addBox(0, -2, 0, 3, 5, 1);
        setRotateAngle(vehiclebackplate1, 1.5882496193148399F, -0.017453292519943295F, 1.5707963267948966F);
        vehicleLplate1 = new ModelRendererTF(this, 0, 17);
        vehicleLplate1.mirror = true;
        vehicleLplate1.setRotationPoint(0, 0.4F, 0.3F);
        vehicleLplate1.addBox(0.4F, -0.9F, -5.2F, 3, 1, 6);
        setRotateAngle(vehicleLplate1, 0.061086523819801536F, -0.05235987755982988F, 0.017453292519943295F);
        vehiclelowerarmR1 = new ModelRendererTF(this, 64, 65);
        vehiclelowerarmR1.mirror = true;
        vehiclelowerarmR1.setRotationPoint(1, 3.3F, 0.4F);
        vehiclelowerarmR1.addBox(-0.9F, -0.2F, -1.6F, 2, 4, 3);
        setRotateAngle(vehiclelowerarmR1, -3.141592653589793F, 0, 0);
        vehiclerear1 = new ModelRendererTF(this, 0, 0);
        vehiclerear1.setRotationPoint(0, 0.3F, 4);
        vehiclerear1.addBox(-2.5F, 0.1F, 0, 5, 2, 5);
        setRotateAngle(vehiclerear1, -0.3141592653589793F, 0, 0);
        vehiclearmbaseR1 = new ModelRendererTF(this, 64, 60);
        vehiclearmbaseR1.setRotationPoint(-1, -0.4F, 1);
        vehiclearmbaseR1.addBox(-2, -1, -1, 2, 2, 3);
        vehicleWaist1 = new ModelRendererTF(this, 0, 64);
        vehicleWaist1.mirror = true;
        vehicleWaist1.setRotationPoint(0, 7, 1.5F);
        vehicleWaist1.addBox(0, 0, 0, 3, 2, 1);
        setRotateAngle(vehicleWaist1, -1.5707963267948966F, 0, 3.211405823669566F);
        vehiclelowerlegL7 = new ModelRendererTF(this, 14, 85);
        vehiclelowerlegL7.mirror = true;
        vehiclelowerlegL7.setRotationPoint(-0.5F, 1, 1.6F);
        vehiclelowerlegL7.addBox(-0.6F, -0.5F, -1, 3, 2, 1);
        setRotateAngle(vehiclelowerlegL7, 0.6108652381980153F, 0.05235987755982988F, 0);
        vehicleshoulderL1_1 = new ModelRendererTF(this, 78, 60);
        vehicleshoulderL1_1.mirror = true;
        vehicleshoulderL1_1.setRotationPoint(2.3F, 0, -1.6F);
        vehicleshoulderL1_1.addBox(-1, -1.4F, -1.5F, 1, 3, 3);
        setRotateAngle(vehicleshoulderL1_1, -0.019198621771937624F, 0, 0);
        vehicleshoulderL1 = new ModelRendererTF(this, 78, 60);
        vehicleshoulderL1.setRotationPoint(-2.3F, 0, -1.6F);
        vehicleshoulderL1.addBox(0, -1.4F, -1.5F, 1, 3, 3);
        setRotateAngle(vehicleshoulderL1, -0.019198621771937624F, 0, 0);
        vehiclefrontR1 = new ModelRendererTF(this, 35, 77);
        vehiclefrontR1.setRotationPoint(-1.8F, -0.1F, -0.9F);
        vehiclefrontR1.addBox(-1.5F, -1, -4, 2, 2, 3);
        vehicleUpperlegR2 = new ModelRendererTF(this, 6, 72);
        vehicleUpperlegR2.setRotationPoint(-2, -0.5F, -0.5F);
        vehicleUpperlegR2.addBox(0, 0, 0, 1, 4, 1);
        setRotateAngle(vehicleUpperlegR2, 0, 0.05235987755982988F, -0.03490658503988659F);
        vehicleupperlegL2 = new ModelRendererTF(this, 6, 72);
        vehicleupperlegL2.setRotationPoint(2, -0.5F, -0.5F);
        vehicleupperlegL2.addBox(-1, 0, 0, 1, 4, 1);
        setRotateAngle(vehicleupperlegL2, 0, -0.05235987755982988F, 0.03490658503988659F);
        vehiclekneeL2 = new ModelRendererTF(this, 10, 71);
        vehiclekneeL2.setRotationPoint(0, 2.7F, 0);
        vehiclekneeL2.addBox(0, 0, -1, 2, 2, 2);
        vehicleUpperlegR1 = new ModelRendererTF(this, 0, 71);
        vehicleUpperlegR1.setRotationPoint(-1, 1, 0);
        vehicleUpperlegR1.addBox(-1, -1, -1, 1, 4, 2);
        setRotateAngle(vehicleUpperlegR1, -1.5707963267948966F, 0, 0);
        vehiclefrontR2 = new ModelRendererTF(this, 48, 70);
        vehiclefrontR2.setRotationPoint(0, 0, 0);
        vehiclefrontR2.addBox(-1.5F, -2, -3.7F, 2, 1, 3);
        setRotateAngle(vehiclefrontR2, 0.24434609527920614F, 0, -0.017453292519943295F);
        vehicleKneeR1 = new ModelRendererTF(this, 10, 71);
        vehicleKneeR1.setRotationPoint(0, 2.7F, 0);
        vehicleKneeR1.addBox(-2, 0, -1, 2, 2, 2);
        vehicleUpperarmL1 = new ModelRendererTF(this, 74, 60);
        vehicleUpperarmL1.mirror = true;
        vehicleUpperarmL1.setRotationPoint(0.5F, 0, 1);
        vehicleUpperarmL1.addBox(0, 0.8F, -0.5F, 1, 3, 1);
        setRotateAngle(vehicleUpperarmL1, 1.5707963267948966F, 0, 0);
        vehicleLowerarmL2 = new ModelRendererTF(this, 74, 68);
        vehicleLowerarmL2.mirror = true;
        vehicleLowerarmL2.setRotationPoint(1.5F, 3.5F, 0);
        vehicleLowerarmL2.addBox(-1, -3, -1.9F, 1, 3, 2);
        setRotateAngle(vehicleLowerarmL2, 0.03490658503988659F, 0.2617993877991494F, 0.10122909661567112F);
        vehicleLowerlegR4 = new ModelRendererTF(this, 8, 83);
        vehicleLowerlegR4.setRotationPoint(0.3F, 2.5F, 0.9F);
        vehicleLowerlegR4.addBox(-0.5F, -2, -2, 1, 3, 2);
        setRotateAngle(vehicleLowerlegR4, 0.15707963267948966F, 0.10471975511965977F, -0.08726646259971647F);
        vehicleUpperlegL1 = new ModelRendererTF(this, 0, 71);
        vehicleUpperlegL1.setRotationPoint(1, 1, 0);
        vehicleUpperlegL1.addBox(0, -1, -1, 1, 4, 2);
        setRotateAngle(vehicleUpperlegL1, -1.5707963267948966F, 0, 0);
        vehicleRear2 = new ModelRendererTF(this, 0, 27);
        vehicleRear2.setRotationPoint(0, 0, 2);
        vehicleRear2.addBox(-2.5F, 0, 0, 5, 1, 2);
        setRotateAngle(vehicleRear2, -0.19198621771937624F, 0, 0);
        vehicleRearplate = new ModelRendererTF(this, 0, 12);
        vehicleRearplate.setRotationPoint(0, 0.6F, -1.1F);
        vehicleRearplate.addBox(-1.5F, -1, -4, 3, 1, 4);
        vehicleBase = new ModelRendererTF(this, 0, 60);
        vehicleBase.setRotationPoint(0, 22.3F, 1);
        vehicleBase.addBox(-2, 0, -1, 4, 1, 3);
        setRotateAngle(vehicleBase, 1.5707963267948966F, 0, 0);
        vehiclehood1 = new ModelRendererTF(this, 47, 60);
        vehiclehood1.setRotationPoint(0, -0.5F, -3.8F);
        vehiclehood1.addBox(-1.5F, -3, -1, 3, 4, 1);
        setRotateAngle(vehiclehood1, -1.3439035240356336F, 0, 0);

        vehicleWheelBackR = new ModelRendererTF(this, 55, 68);
        vehicleWheelBackR.setRotationPoint(-1F, 3F, 2.2F);
        vehicleWheelBackR.addBox(-1, -1, -1, 1, 2, 2);
        vehicleWheelBackL = new ModelRendererTF(this, 55, 68);
        vehicleWheelBackL.mirror = true;
        vehicleWheelBackL.setRotationPoint(1, 3, 2.3F);
        vehicleWheelBackL.addBox(0, -1, -1, 1, 2, 2);
        vehicleWheelL = new ModelRendererTF(this, 55, 68);
        vehicleWheelL.mirror = true;
        vehicleWheelL.setRotationPoint(2.7F, 0.3F, -2);
        vehicleWheelL.addBox(0, -1, -1, 1, 2, 2);
        vehicleWheelR = new ModelRendererTF(this, 55, 68);
        vehicleWheelR.setRotationPoint(-2.7F, 0.3F, -2);
        vehicleWheelR.addBox(-1, -1, -1, 1, 2, 2);

        vehiclearmbaseL1 = new ModelRendererTF(this, 64, 60);
        vehiclearmbaseL1.mirror = true;
        vehiclearmbaseL1.setRotationPoint(1, -0.4F, 1);
        vehiclearmbaseL1.addBox(0, -1, -1, 2, 2, 3);
        vehicletorsobase = new ModelRendererTF(this, 35, 66);
        vehicletorsobase.setRotationPoint(0, -4, 0);
        vehicletorsobase.addBox(-2, -2, -1.3F, 4, 3, 4);
        setRotateAngle(vehicletorsobase, -1.5707963267948966F, -0.7853981633974483F, 0);

        vehicleWaistConnector1.addChild(vehicleRearplate);
        vehicletorsobase.addChild(vehiclehood1);
        vehiclelowerlegL1.addChild(vehicleWheelBackL);
        vehicletorsobase.addChild(vehicleWheelL);
        vehicletorsobase.addChild(vehiclearmbaseL1);
        vehicleTorsoconnector1.addChild(vehicletorsobase);
        vehicletorsobase.addChild(vehiclebackplate2);
        vehicleBase.addChild(vehicleWaistConnector1);
        vehicletorsobase.addChild(vehiclewindow1);
        vehicleKneeR1.addChild(vehicleLowerlegR1);
        vehiclekneeL2.addChild(vehiclelowerlegL1);
        vehicleUpperarmL1.addChild(vehicleLowerarmL1);
        vehicletorsobase.addChild(vehicleWheelR);
        vehiclefrontL1.addChild(vehiclefrontL2);
        vehicleBase.addChild(vehicleWaist2);
        vehiclearmbaseR1.addChild(vehicleupperarmR1);
        vehiclehood1.addChild(vehiclehood3);
        vehicleBase.addChild(vehicleTorsoconnector1);
        vehiclelowerlegL1.addChild(vehiclelowerlegL5);
        vehiclehood1.addChild(vehiclehood2);
        vehicleLowerlegR1.addChild(vehicleLowerlegR5);
        vehiclelowerlegL1.addChild(vehiclelowerlegL4);
        vehiclehood1.addChild(vehiclehood4);
        vehiclewindow1.addChild(vehicleWindow2);
        vehicleupperarmR1.addChild(vehiclelowerarmR1);
        vehicleKneeR1.addChild(vehiclelowerlegR7);
        vehiclelowerarmR1.addChild(vehiclelowerarmR2);
        vehicleWaistConnector1.addChild(vehicleRplate1);
        vehicletorsobase.addChild(vehiclefrontL1);
        vehicletorsobase.addChild(vehiclebaseplate);
        vehicletorsobase.addChild(vehiclebackplate1);
        vehicleWaistConnector1.addChild(vehicleLplate1);
        vehicleWindow2.addChild(vehiclerear1);
        vehicleBase.addChild(vehicleWaist1);
        vehicletorsobase.addChild(vehiclearmbaseR1);
        vehiclekneeL2.addChild(vehiclelowerlegL7);
        vehiclearmbaseL1.addChild(vehicleshoulderL1_1);
        vehiclearmbaseR1.addChild(vehicleshoulderL1);
        vehicletorsobase.addChild(vehiclefrontR1);
        vehicleUpperlegR1.addChild(vehicleUpperlegR2);
        vehicleUpperlegL1.addChild(vehicleupperlegL2);
        vehicleUpperlegL1.addChild(vehiclekneeL2);
        vehicleWaistConnector1.addChild(vehicleUpperlegR1);
        vehiclefrontR1.addChild(vehiclefrontR2);
        vehicleUpperlegR1.addChild(vehicleKneeR1);
        vehiclearmbaseL1.addChild(vehicleUpperarmL1);
        vehicleWaistConnector1.addChild(vehicleUpperlegL1);
        vehicleWindow2.addChild(vehicleRear2);
        vehicleLowerlegR1.addChild(vehicleLowerlegR4);
        vehicleLowerlegR1.addChild(vehicleWheelBackR);
        vehicleLowerarmL1.addChild(vehicleLowerarmL2);

        float scale = 1.25F;
        vehicleWheelR.setScale(1, scale, scale);
        vehicleWheelL.setScale(1, scale, scale);
        vehicleWheelBackR.setScale(1, scale, scale);
        vehicleWheelBackL.setScale(1, scale, scale);

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

                for (ModelRenderer modelRenderer : new ModelRenderer[] {vehicleWheelR, vehicleWheelL, vehicleWheelBackR, vehicleWheelBackL})
                {
                    modelRenderer.rotateAngleX = wheelSpinSpeed;
                }
            }
            
            vehicleBase.rotateAngleX = (float) (Math.PI / 2 - TFRenderHelper.getMotionY(player) - (player == Minecraft.getMinecraft().thePlayer && player.onGround ? 0.0784000015258789 : 0));
            vehicleBase.rotateAngleY = -(float) Math.toRadians(TFRenderHelper.median(player.renderYawOffset - player.rotationYaw, player.prevRenderYawOffset - player.prevRotationYaw, ClientEventHandler.renderTick));
        }
    }
}
