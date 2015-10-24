package fiskfille.tf.client.model.transformer.vehicle;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.item.ItemStack;

public class ModelSkystrikeVehicle extends ModelVehicleBase
{
    public ModelRenderer shape131;
    public ModelRenderer shape132;
    public ModelRenderer shape133;
    public ModelRenderer shape134;
    public ModelRenderer shape136;
    public ModelRenderer shape137;
    public ModelRenderer shape138;
    public ModelRenderer shape139;
    public ModelRenderer shape140;
    public ModelRenderer shape141;
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape6;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape10;
    public ModelRenderer shape11;
    public ModelRenderer shape12;
    public ModelRenderer shape13;
    public ModelRenderer shape14;
    public ModelRenderer shape15;
    public ModelRenderer shape16;
    public ModelRenderer shape130;
    public ModelRenderer shape30;
    public ModelRenderer shape31;
    public ModelRenderer shape32;
    public ModelRenderer shape33;
    public ModelRenderer shape35;
    public ModelRenderer shape56;
    public ModelRenderer shape58;
    public ModelRenderer shape59;
    public ModelRenderer shape64;
    public ModelRenderer shape66;
    public ModelRenderer shape67;
    public ModelRenderer shape40;
    public ModelRenderer shape44;
    public ModelRenderer shape41;
    public ModelRenderer shape43;
    public ModelRenderer shape49;
    public ModelRenderer shape68;
    public ModelRenderer shape69;
    public ModelRenderer shape70;
    public ModelRenderer shape75;
    public ModelRenderer shape77;
    public ModelRenderer shape78;
    public ModelRenderer vehicleBody;

    public ModelSkystrikeVehicle()
    {
        textureWidth = 128;
        textureHeight = 128;

        shape59 = new ModelRenderer(this, 75, 55);
        shape59.mirror = true;
        shape59.setRotationPoint(-4.5F, 13.5F, 3.9F);
        shape59.addBox(-2.0F, 1.0F, 0.5F, 2, 3, 3, 0.0F);
        shape139 = new ModelRenderer(this, 55, 0);
        shape139.setRotationPoint(4.0F, -3.0F, 7.0F);
        shape139.addBox(0.0F, 0.0F, 0.0F, 3, 4, 5, 0.0F);
        shape16 = new ModelRenderer(this, 0, 49);
        shape16.setRotationPoint(-2.0F, 7.1F, 3.0F);
        shape16.addBox(0.0F, -0.4F, -6.0F, 4, 2, 4, 0.0F);
        setRotation(shape16, -1.0018189906447452F, 0.0F, 0.0F);
        shape8 = new ModelRenderer(this, 0, 84);
        shape8.setRotationPoint(-1.5F, 4.0F, -9.0F);
        shape8.addBox(0.0F, -0.2F, -0.6F, 3, 4, 2, 0.0F);
        setRotation(shape8, 1.879719604397893F, 0.0F, 0.0F);
        shape12 = new ModelRenderer(this, 12, 76);
        shape12.setRotationPoint(4.0F, 0.0F, 0.0F);
        shape12.addBox(-2.5F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
        setRotation(shape12, 0.9948376736367678F, 0.0F, 0.0F);
        shape56 = new ModelRenderer(this, 63, 49);
        shape56.setRotationPoint(0.0F, -4.5F, 20.0F);
        shape56.addBox(-3.0F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
        setRotation(shape56, -1.5707963267948966F, 0.0F, 0.0F);
        shape75 = new ModelRenderer(this, 73, 73);
        shape75.setRotationPoint(1.3F, 14.7F, 5.6F);
        shape75.addBox(0.5F, -1.0F, -0.1F, 2, 8, 1, 0.0F);
        shape41 = new ModelRenderer(this, 36, 68);
        shape41.setRotationPoint(0.0F, -3.0F, -2.5F);
        shape41.addBox(-1.0F, -0.2F, 0.0F, 1, 4, 4, 0.0F);
        setRotation(shape41, 0.0F, 0.0F, 1.3055062804917585F);
        shape78 = new ModelRenderer(this, 73, 76);
        shape78.mirror = true;
        shape78.setRotationPoint(0.5F, 9.5F, 3.9F);
        shape78.addBox(0.0F, 2.6F, -27.0F, 1, 1, 6, 0.0F);
        setRotation(shape78, 1.5707963267948966F, 0.0F, 0.0F);
        shape35 = new ModelRenderer(this, 36, 76);
        shape35.mirror = true;
        shape35.setRotationPoint(2.0F, 1.0F, -2.0F);
        shape35.addBox(1.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        setRotation(shape35, 0.0F, 0.008726646259971648F, 0.0F);
        shape137 = new ModelRenderer(this, 37, 0);
        shape137.setRotationPoint(0.0F, -3.0F, 19.5F);
        shape137.addBox(-2.0F, -2.9F, -9.3F, 4, 3, 10, 0.0F);
        setRotation(shape137, 0.41887902047863906F, 0.0F, 0.0F);
        shape68 = new ModelRenderer(this, 63, 49);
        shape68.mirror = true;
        shape68.setRotationPoint(0.0F, -4.5F, 20.0F);
        shape68.addBox(0.0F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
        setRotation(shape68, -1.5707963267948966F, 0.0F, 0.0F);
        shape31 = new ModelRenderer(this, 36, 60);
        shape31.mirror = true;
        shape31.setRotationPoint(10.0F, 6.0F, -1.8F);
        shape31.addBox(-7.0F, -1.0F, 0.0F, 8, 1, 4, 0.0F);
        setRotation(shape31, -1.5707963267948966F, -0.07853981633974483F, 0.5061454830783556F);
        shape66 = new ModelRenderer(this, 73, 76);
        shape66.mirror = true;
        shape66.setRotationPoint(0.5F, 9.5F, 3.9F);
        shape66.addBox(-6.5F, 1.6F, -14.0F, 1, 1, 6, 0.0F);
        setRotation(shape66, 1.5707963267948966F, 0.0F, 0.0F);
        shape136 = new ModelRenderer(this, 0, 15);
        shape136.setRotationPoint(-3.5F, -5.0F, 5.0F);
        shape136.addBox(0.0F, 0.0F, 0.0F, 7, 6, 6, 0.0F);
        shape77 = new ModelRenderer(this, 73, 76);
        shape77.mirror = true;
        shape77.setRotationPoint(0.5F, 9.5F, 3.9F);
        shape77.addBox(4.5F, 1.6F, -14.0F, 1, 1, 6, 0.0F);
        setRotation(shape77, 1.5707963267948966F, 0.0F, 0.0F);
        shape10 = new ModelRenderer(this, 0, 90);
        shape10.setRotationPoint(-4.0F, 7.0F, 3.0F);
        shape10.addBox(0.5F, -0.7F, -5.8F, 2, 3, 4, 0.0F);
        setRotation(shape10, -0.9948376736367678F, 0.0F, 0.0F);
        shape13 = new ModelRenderer(this, 8, 87);
        shape13.setRotationPoint(-1.5F, 0.0F, 0.0F);
        shape13.addBox(0.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        setRotation(shape13, 0.9948376736367678F, 0.0F, 0.0F);
        shape32 = new ModelRenderer(this, 36, 65);
        shape32.setRotationPoint(11.0F, 11.6F, -1.5F);
        shape32.addBox(-9.0F, -1.0F, -0.4F, 6, 1, 2, 0.0F);
        setRotation(shape32, -1.5707963267948966F, -0.07853981633974483F, 0.5061454830783556F);
        shape49 = new ModelRenderer(this, 36, 60);
        shape49.setRotationPoint(-10.0F, 6.0F, -1.8F);
        shape49.addBox(-1.0F, -1.0F, 0.0F, 8, 1, 4, 0.0F);
        setRotation(shape49, -1.5707963267948966F, 0.07853981633974483F, -0.5061454830783556F);
        shape138 = new ModelRenderer(this, 55, 0);
        shape138.mirror = true;
        shape138.setRotationPoint(-4.0F, -3.0F, 7.0F);
        shape138.addBox(-3.0F, 0.0F, 0.0F, 3, 4, 5, 0.0F);
        shape70 = new ModelRenderer(this, 75, 55);
        shape70.mirror = true;
        shape70.setRotationPoint(4.5F, 13.5F, 3.9F);
        shape70.addBox(0.0F, 1.0F, 0.5F, 2, 3, 3, 0.0F);
        shape69 = new ModelRenderer(this, 63, 58);
        shape69.mirror = true;
        shape69.setRotationPoint(0.0F, 5.5F, -1.5F);
        shape69.addBox(-0.1F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        setRotation(shape69, 0.2617993877991494F, 0.0F, 0.0F);
        shape131 = new ModelRenderer(this, 0, 28);
        shape131.setRotationPoint(-3.5F, -3.5F, -4.0F);
        shape131.addBox(0.0F, 0.6F, -11.0F, 3, 5, 13, 0.0F);
        setRotation(shape131, 0.06981317007977318F, -0.13962634015954636F, 0.0F);
        shape44 = new ModelRenderer(this, 36, 65);
        shape44.setRotationPoint(-11.0F, 11.6F, -1.5F);
        shape44.addBox(3.0F, -1.0F, -0.4F, 6, 1, 2, 0.0F);
        setRotation(shape44, -1.5707963267948966F, 0.07853981633974483F, -0.5061454830783556F);
        shape43 = new ModelRenderer(this, 36, 76);
        shape43.setRotationPoint(-2.0F, 1.0F, -2.0F);
        shape43.addBox(-2.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        setRotation(shape43, 0.0F, -0.008726646259971648F, 0.0F);
        shape2 = new ModelRenderer(this, 0, 55);
        shape2.mirror = true;
        shape2.setRotationPoint(-2.5F, 1.5F, 9.0F);
        shape2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
        setRotation(shape2, 0.0F, -1.5707963267948966F, 0.0F);
        shape64 = new ModelRenderer(this, 73, 73);
        shape64.mirror = true;
        shape64.setRotationPoint(-1.3F, 14.7F, 5.6F);
        shape64.addBox(-2.5F, -1.0F, -0.1F, 2, 8, 1, 0.0F);
        shape141 = new ModelRenderer(this, 0, 0);
        shape141.mirror = true;
        shape141.setRotationPoint(3.0F, -6.0F, 15.0F);
        shape141.addBox(-1.0F, 0.0F, 0.0F, 6, 1, 5, 0.0F);
        setRotation(shape141, 0.03490658503988659F, -0.15707963267948966F, -0.7853981633974483F);
        shape6 = new ModelRenderer(this, 0, 76);
        shape6.setRotationPoint(-2.0F, 3.5F, -5.6F);
        shape6.addBox(0.0F, 0.3F, 0.0F, 4, 6, 2, 0.0F);
        setRotation(shape6, 1.8203784098300857F, 0.0F, 0.0F);
        shape67 = new ModelRenderer(this, 73, 76);
        shape67.mirror = true;
        shape67.setRotationPoint(0.5F, 9.5F, 3.9F);
        shape67.addBox(-2.0F, 2.6F, -27.0F, 1, 1, 6, 0.0F);
        setRotation(shape67, 1.5707963267948966F, 0.0F, 0.0F);
        shape140 = new ModelRenderer(this, 0, 0);
        shape140.setRotationPoint(-3.0F, -6.0F, 15.0F);
        shape140.addBox(-5.0F, 0.0F, 0.0F, 6, 1, 5, 0.0F);
        setRotation(shape140, 0.03490658503988659F, 0.15707963267948966F, 0.7853981633974483F);
        shape133 = new ModelRenderer(this, 19, 15);
        shape133.setRotationPoint(-2.0F, -2.2F, -15.0F);
        shape133.addBox(0.0F, 0.0F, 0.0F, 4, 5, 21, 0.0F);
        shape132 = new ModelRenderer(this, 0, 28);
        shape132.mirror = true;
        shape132.setRotationPoint(3.5F, -3.5F, -4.0F);
        shape132.addBox(-3.0F, 0.6F, -11.0F, 3, 5, 13, 0.0F);
        setRotation(shape132, 0.06981317007977318F, 0.13962634015954636F, 0.0F);
        shape7 = new ModelRenderer(this, 12, 76);
        shape7.mirror = true;
        shape7.setRotationPoint(-4.0F, 0.0F, 0.0F);
        shape7.addBox(0.5F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
        setRotation(shape7, 0.9948376736367678F, 0.0F, 0.0F);
        shape30 = new ModelRenderer(this, 36, 51);
        shape30.setRotationPoint(3.5F, -1.5F, -1.0F);
        shape30.addBox(0.0F, -3.0F, -3.0F, 4, 4, 5, 0.0F);
        setRotation(shape30, 1.5707963267948966F, 0.0F, 0.0F);
        shape33 = new ModelRenderer(this, 36, 68);
        shape33.mirror = true;
        shape33.setRotationPoint(0.0F, -3.0F, -2.5F);
        shape33.addBox(0.0F, -0.2F, 0.0F, 1, 4, 4, 0.0F);
        setRotation(shape33, 0.0F, 0.0F, -1.3055062804917585F);
        shape40 = new ModelRenderer(this, 36, 51);
        shape40.mirror = true;
        shape40.setRotationPoint(-3.5F, -1.5F, -1.0F);
        shape40.addBox(-4.0F, -3.0F, -3.0F, 4, 4, 5, 0.0F);
        setRotation(shape40, 1.5707963267948966F, 0.0F, 0.0F);
        shape3 = new ModelRenderer(this, 0, 55);
        shape3.setRotationPoint(2.5F, 1.5F, 9.0F);
        shape3.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
        setRotation(shape3, 0.0F, 1.5707963267948966F, 0.0F);
        shape15 = new ModelRenderer(this, 12, 93);
        shape15.setRotationPoint(-2.0F, 0.0F, 0.0F);
        shape15.addBox(0.0F, 0.2F, -3.3F, 4, 2, 3, 0.0F);
        setRotation(shape15, 0.9826203688728075F, 0.0F, 0.0F);
        shape1 = new ModelRenderer(this, 0, 64);
        shape1.setRotationPoint(0.0F, -5.0F, -2.0F);
        shape1.addBox(-4.0F, 0.0F, 0.0F, 8, 5, 7, 0.0F);
        shape11 = new ModelRenderer(this, 0, 90);
        shape11.mirror = true;
        shape11.setRotationPoint(4.0F, 7.0F, 3.0F);
        shape11.addBox(-2.5F, -0.7F, -5.8F, 2, 3, 4, 0.0F);
        setRotation(shape11, -0.9948376736367678F, 0.0F, 0.0F);
        shape14 = new ModelRenderer(this, 0, 97);
        shape14.setRotationPoint(-1.5F, 7.0F, 3.0F);
        shape14.addBox(0.0F, 0.3F, -5.8F, 3, 2, 4, 0.0F);
        setRotation(shape14, -0.9948376736367678F, 0.0F, 0.0F);
        shape58 = new ModelRenderer(this, 63, 58);
        shape58.setRotationPoint(0.0F, 5.5F, -1.5F);
        shape58.addBox(-2.9F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        setRotation(shape58, 0.2617993877991494F, 0.0F, 0.0F);
        shape134 = new ModelRenderer(this, 0, 7);
        shape134.setRotationPoint(0.0F, 3.5F, 0.0F);
        shape134.addBox(-7.5F, -3.0F, 0.0F, 15, 1, 7, 0.0F);
        shape4 = new ModelRenderer(this, 12, 53);
        shape4.setRotationPoint(-3.0F, 7.0F, 0.0F);
        shape4.addBox(0.0F, -0.1F, -0.1F, 6, 7, 4, 0.0F);
        setRotation(shape4, 1.5707963267948966F, 0.0F, 0.0F);
        shape130 = new ModelRenderer(this, 0, 7);
        shape130.setRotationPoint(0.0F, 8.5F, 2.0F);
        shape130.addBox(-7.5F, -7.0F, 0.0F, 15, 1, 7, 0.0F);
        shape56.addChild(shape59);
        shape1.addChild(shape16);
        shape1.addChild(shape8);
        shape1.addChild(shape12);
        shape68.addChild(shape75);
        shape40.addChild(shape41);
        shape68.addChild(shape78);
        shape30.addChild(shape35);
        shape30.addChild(shape31);
        shape56.addChild(shape66);
        shape68.addChild(shape77);
        shape1.addChild(shape10);
        shape1.addChild(shape13);
        shape30.addChild(shape32);
        shape40.addChild(shape49);
        shape68.addChild(shape70);
        shape68.addChild(shape69);
        shape40.addChild(shape44);
        shape40.addChild(shape43);
        shape1.addChild(shape2);
        shape56.addChild(shape64);
        shape1.addChild(shape6);
        shape56.addChild(shape67);
        shape1.addChild(shape7);
        shape30.addChild(shape33);
        shape1.addChild(shape3);
        shape1.addChild(shape15);
        shape1.addChild(shape11);
        shape1.addChild(shape14);
        shape56.addChild(shape58);
        shape1.addChild(shape4);
        shape1.addChild(shape130);
        vehicleBody = new ModelRenderer(this, 0, 0);
        vehicleBody.addBox(-4.0F, 0.0F, -2.0F, 0, 0, 0);
        vehicleBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        addChildTo(shape1, vehicleBody);
        addChildTo(shape30, vehicleBody);
        addChildTo(shape56, vehicleBody);
        addChildTo(shape40, vehicleBody);
        addChildTo(shape68, vehicleBody);
        addChildTo(shape130, vehicleBody);
        addChildTo(shape131, vehicleBody);
        addChildTo(shape132, vehicleBody);
        addChildTo(shape133, vehicleBody);
        addChildTo(shape134, vehicleBody);
        addChildTo(shape136, vehicleBody);
        addChildTo(shape137, vehicleBody);
        addChildTo(shape138, vehicleBody);
        addChildTo(shape139, vehicleBody);
        addChildTo(shape140, vehicleBody);
        addChildTo(shape141, vehicleBody);

        vehicleBody.offsetY = 1.2F;
    }

    public void render(ItemStack itemstack)
    {
        vehicleBody.offsetY = 1.2F;
        setupRenderLayers(itemstack, vehicleBody);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}