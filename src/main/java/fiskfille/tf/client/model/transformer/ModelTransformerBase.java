package fiskfille.tf.client.model.transformer;

import java.util.Arrays;
import java.util.List;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Lists;

import fiskfille.tf.client.event.ClientEventHandler;
import fiskfille.tf.client.model.AnimationModifier;
import fiskfille.tf.client.model.tools.ModelRendererTF;
import fiskfille.tf.client.model.tools.MowzieModelBase;
import fiskfille.tf.client.model.transformer.definition.TFModelRegistry;
import fiskfille.tf.client.model.transformer.definition.TransformerModel;
import fiskfille.tf.client.model.transformer.vehicle.ModelVehicleBase;
import fiskfille.tf.common.data.TFDataManager;
import fiskfille.tf.common.transformer.base.Transformer;
import fiskfille.tf.helper.TFArmorDyeHelper;
import fiskfille.tf.helper.TFHelper;
import fiskfille.tf.helper.TFRenderHelper;

public abstract class ModelTransformerBase extends MowzieModelBase
{
    private final float baseSpeed;
    private final float baseDegree;
    private AnimationModifier[] animModifiers;

    public int layerToRender;

    public float globalSpeed;
    public float globalDegree;
    public int backwardInverter = 1;

    public ModelTransformerBase(float speed, float degree, AnimationModifier... modifiers)
    {
        baseSpeed = speed;
        baseDegree = degree;
        animModifiers = modifiers;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        if (entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) entity;

            ItemStack head = player.getCurrentArmor(3);
            ItemStack chest = player.getCurrentArmor(2);
            ItemStack legs = player.getCurrentArmor(1);
            ItemStack feet = player.getCurrentArmor(0);

            boolean wearingHead = TFHelper.getTransformerFromArmor(player, 3) == getTransformer();
            boolean wearingChest = TFHelper.getTransformerFromArmor(player, 2) == getTransformer();
            boolean wearingLegs = TFHelper.getTransformerFromArmor(player, 1) == getTransformer();
            boolean wearingFeet = TFHelper.getTransformerFromArmor(player, 0) == getTransformer();
            boolean hasLightsLayer = getTransformerModel().hasLightsLayer();

            TransformerModel tfModel = getTransformerModel();
            ModelVehicleBase vehicleModel = tfModel.getEffectiveVehicleModel(player);

            vehicleModel.setRotationAngles(f, f1, f2, f3, f4, f5, player);
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);

            if (TFDataManager.getTransformationTimer(player, ClientEventHandler.renderTick) == 0)
            {
                if (layerToRender == 2)
                {
                    vehicleModel.render(player, chest, hasLightsLayer); // TODO: Create display vehicle instance with all pieces
                }
            }
            else
            {
                if (!wearingChest)
                {
                    if (layerToRender == 1 && wearingHead)
                    {
                        TFRenderHelper.setupRenderLayers(head, tfModel.getHead(), hasLightsLayer);
                    }

                    if (layerToRender == 3 && wearingLegs)
                    {
                        List<ModelRenderer> hidden = Lists.newArrayList();
                        hidden.add(tfModel.getHead());
                        hidden.addAll(Arrays.asList(tfModel.getFeet()));

                        getWaist().hideUntil(tfModel.getLegs());

                        for (ModelRenderer model : hidden)
                        {
                            model.isHidden = true;
                        }

                        TFRenderHelper.setupRenderLayers(legs, getWaist(), hasLightsLayer);

                        for (ModelRenderer model : hidden)
                        {
                            model.isHidden = false;
                        }
                    }

                    if (layerToRender == 4 && wearingFeet)
                    {
                        getWaist().hideUntil(tfModel.getFeet());

                        tfModel.getHead().isHidden = true;
                        TFRenderHelper.setupRenderLayers(feet, getWaist(), hasLightsLayer);
                        tfModel.getHead().isHidden = false;
                    }
                }
                else if (!TFArmorDyeHelper.areColorsIdentical(head, chest, legs, feet))
                {
                    List<ModelRenderer> hidden = Lists.newArrayList();
                    ItemStack itemstack = chest;

                    if (layerToRender == 1)
                    {
                        if (!TFArmorDyeHelper.areColorsIdentical(chest, head))
                        {
                            getWaist().hideUntil(tfModel.getHead());
                            hidden.addAll(Arrays.asList(tfModel.getLegs()));
                            itemstack = head;
                        }
                        else
                        {
                            return;
                        }
                    }
                    else if (layerToRender == 2)
                    {
                        if (!TFArmorDyeHelper.areColorsIdentical(chest, head))
                        {
                            hidden.add(tfModel.getHead());
                        }

                        if (!TFArmorDyeHelper.areColorsIdentical(chest, legs))
                        {
                            hidden.addAll(Arrays.asList(tfModel.getLegs()));
                        }
                        else if (!TFArmorDyeHelper.areColorsIdentical(chest, feet))
                        {
                            hidden.addAll(Arrays.asList(tfModel.getFeet()));
                        }
                    }
                    else if (layerToRender == 3)
                    {
                        if (!TFArmorDyeHelper.areColorsIdentical(chest, legs))
                        {
                            getWaist().hideUntil(tfModel.getLegs());
                            hidden.add(tfModel.getHead());
                            itemstack = legs;

                            if (!TFArmorDyeHelper.areColorsIdentical(legs, feet))
                            {
                                hidden.addAll(Arrays.asList(tfModel.getFeet()));
                            }
                        }
                        else
                        {
                            return;
                        }
                    }
                    else
                    {
                        if (!TFArmorDyeHelper.areColorsIdentical(legs, feet))
                        {
                            getWaist().hideUntil(tfModel.getFeet());
                            hidden.add(tfModel.getHead());
                            itemstack = feet;
                        }
                        else
                        {
                            return;
                        }
                    }

                    for (ModelRenderer model : hidden)
                    {
                        model.isHidden = true;
                    }

                    TFRenderHelper.setupRenderLayers(itemstack, getWaist(), hasLightsLayer);

                    for (ModelRenderer model : hidden)
                    {
                        model.isHidden = false;
                    }
                }
                else
                {
                    if (layerToRender == 2)
                    {
                        TFRenderHelper.setupRenderLayers(chest, getWaist(), hasLightsLayer);
                    }
                }

                getWaist().hideUntil();
            }
        }
    }

    protected final TransformerModel getTransformerModel()
    {
        TransformerModel model = TFModelRegistry.getModel(getTransformer());

        if (model == null)
        {
            throw new RuntimeException(String.format("No TransformerModel instance registered for type '%s'!", getTransformer().getName()));
        }

        return model;
    }

    public void setupOffsets(EntityPlayer player, float t, float f, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs) {}

    public void doActiveAnimations(EntityPlayer player, float t, float f, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs) {}

    public void doWalkingAnimations(EntityPlayer player, float t, float f, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs) {}

    public void doIdleAnimations(EntityPlayer player, float t, float f, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs) {}

    public void doFallingAnimations(EntityPlayer player, float t, float f, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs) {}

    public void doPartialAnimations(EntityPlayer player, float t, float f, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs) {}

    public void doTransformationAnimations(EntityPlayer player, float t, float f, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, boolean wearingHead, boolean wearingChest, boolean wearingLegs) {}

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, float scale, Entity entity)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, scale, entity);
        setToInitPose();
        globalSpeed = baseSpeed;
        globalDegree = baseDegree;

        if (entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) entity;
            boolean wearingHead = TFHelper.getTransformerFromArmor(player, 3) == getTransformer();
            boolean wearingChest = TFHelper.getTransformerFromArmor(player, 2) == getTransformer();
            boolean wearingLegs = TFHelper.getTransformerFromArmor(player, 1) == getTransformer();
            float t = TFDataManager.getTransformationTimer(player, ClientEventHandler.renderTick);
            float f = 20 - t;

            setupOffsets(player, t, f, limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, wearingHead, wearingChest, wearingLegs);

            for (AnimationModifier modifier : animModifiers)
            {
                if (modifier.predicate.matches(player))
                {
                    switch (modifier.type)
                    {
                    case SPEED:
                    {
                        globalSpeed *= modifier.factor;
                    }
                    case DEGREE:
                    {
                        globalDegree *= modifier.factor;
                    }
                    }
                }
            }

            if (player.moveForward < 0)
            {
                backwardInverter = -1;
            }
            else
            {
                backwardInverter = 1;
            }

            doActiveAnimations(player, t, f, limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, wearingHead, wearingChest, wearingLegs);

            if (TFHelper.getTransformer(player) == getTransformer())
            {
                if (onGround(player) || player.capabilities.isFlying)
                {
                    doWalkingAnimations(player, t, f, limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, wearingHead, wearingChest, wearingLegs);
                    doIdleAnimations(player, t, f, limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, wearingHead, wearingChest, wearingLegs);
                }
                else
                {
                    doFallingAnimations(player, t, f, limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, wearingHead, wearingChest, wearingLegs);
                }
            }
            else
            {
                doPartialAnimations(player, t, f, limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, wearingHead, wearingChest, wearingLegs);
            }

            doTransformationAnimations(player, t, f, limbSwing, limbSwingAmount, ticks, rotationYaw, rotationPitch, wearingHead, wearingChest, wearingLegs);
        }
    }

    public Transformer getTransformer()
    {
        return null;
    }

    public ModelRendererTF getWaist()
    {
        return null;
    }

    public boolean hasLightsLayer()
    {
        return false;
    }

    public void renderArmorPiece(int armorPiece) {}
}
