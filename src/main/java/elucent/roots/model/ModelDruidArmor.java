package elucent.roots.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.util.EnumHandSide;

public class ModelDruidArmor extends ModelArmorBase {
	
	public EntityEquipmentSlot slot;
	
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
    ModelRenderer head6;
    ModelRenderer head7;
    ModelRenderer head8;
    ModelRenderer head9;
    ModelRenderer head10;
    ModelRenderer head11;
    ModelRenderer head12;
    ModelRenderer head13;
    ModelRenderer head14;
    ModelRenderer head15;
    ModelRenderer head16;
    ModelRenderer head17;

    ModelRenderer chest1;
    ModelRenderer chest2;
    ModelRenderer chest3;
    ModelRenderer chest4;
    ModelRenderer chest5;
    ModelRenderer chest6;
    ModelRenderer chest7;
    ModelRenderer chest8;
    ModelRenderer chest9;
    ModelRenderer chest10;
    ModelRenderer chest11;
    ModelRenderer chest12;
    ModelRenderer chest13;
    
    ModelRenderer armR1;
    ModelRenderer armR2;
    ModelRenderer armR3;
    ModelRenderer armR4;
    ModelRenderer armR5;
    ModelRenderer armR6;
    
    ModelRenderer armL1;
    ModelRenderer armL2;
    ModelRenderer armL3;
    ModelRenderer armL4;
    ModelRenderer armL5;
    ModelRenderer armL6;
    
    ModelRenderer legR1;
    ModelRenderer legR2;
    ModelRenderer legR3;
    ModelRenderer legR4;
    ModelRenderer legR5;
    ModelRenderer legR6;
    
    ModelRenderer legL1;
    ModelRenderer legL2;
    ModelRenderer legL3;
    ModelRenderer legL4;
    ModelRenderer legL5;
    ModelRenderer legL6;
    
    ModelRenderer bootR1;
    ModelRenderer bootR2;
    ModelRenderer bootR3;
    
    ModelRenderer bootL1;
    ModelRenderer bootL2;
    ModelRenderer bootL3;
	
	public ModelDruidArmor(EntityEquipmentSlot slot){
		super(slot);
		  head1 = new ModelRenderer(this, 48, 16);
	      head1.addBox(-1F, -8F, -1F, 2, 8, 2);
	      head1.setRotationPoint(0F, -2F, -6F);
	      head1.setTextureSize(64, 64);
	      head1.mirror = true;
	      setRotation(head1, 0.1308997F, 0F, 0F);
	      head2 = new ModelRenderer(this, 0, 16);
	      head2.addBox(-1F, -8F, -1F, 2, 8, 2);
	      head2.setRotationPoint(2F, -7.5F, -5F);
	      head2.setTextureSize(64, 64);
	      head2.mirror = true;
	      setRotation(head2, -1.047198F, 0.2617994F, 0F);
	      head3 = new ModelRenderer(this, 0, 32);
	      head3.addBox(-1F, -1F, -1F, 2, 2, 2);
	      head3.setRotationPoint(-2F, -2F, -5F);
	      head3.setTextureSize(64, 64);
	      head3.mirror = true;
	      setRotation(head3, 0F, 0F, 0F);
	      head4 = new ModelRenderer(this, 0, 32);
	      head4.addBox(-1F, -1F, -1F, 2, 2, 2);
	      head4.setRotationPoint(0F, -1F, -6F);
	      head4.setTextureSize(64, 64);
	      head4.mirror = true;
	      setRotation(head4, 0F, 0F, 0F);
	      head5 = new ModelRenderer(this, 48, 16);
	      head5.addBox(-1F, -4F, -1F, 2, 6, 2);
	      head5.setRotationPoint(-3.8F, -4F, -1F);
	      head5.setTextureSize(64, 64);
	      head5.mirror = true;
	      setRotation(head5, 0.1308997F, 1.308997F, -0.5235988F);
	      head6 = new ModelRenderer(this, 32, 0);
	      head6.addBox(-6F, -1F, -2F, 6, 2, 4);
	      head6.setRotationPoint(0F, -8F, -5F);
	      head6.setTextureSize(64, 64);
	      head6.mirror = true;
	      setRotation(head6, 0F, 1.570796F, 0.7853982F);
	      head7 = new ModelRenderer(this, 48, 16);
	      head7.addBox(-1F, -6F, -1F, 2, 4, 2);
	      head7.setRotationPoint(-2F, -2F, -5F);
	      head7.setTextureSize(64, 64);
	      head7.mirror = true;
	      setRotation(head7, 0.1308997F, 0.2617994F, 0F);
	      head8 = new ModelRenderer(this, 48, 16);
	      head8.addBox(-1F, -7F, -1F, 2, 7, 2);
	      head8.setRotationPoint(2.933333F, -2F, -4F);
	      head8.setTextureSize(64, 64);
	      head8.mirror = true;
	      setRotation(head8, 0.1308997F, -0.7853982F, 0F);
	      head9 = new ModelRenderer(this, 0, 32);
	      head9.addBox(-1F, -1F, -1F, 2, 2, 2);
	      head9.setRotationPoint(2F, -2F, -5F);
	      head9.setTextureSize(64, 64);
	      head9.mirror = true;
	      setRotation(head9, 0F, 0F, 0F);
	      head10 = new ModelRenderer(this, 0, 16);
	      head10.addBox(-1F, -6F, -1F, 2, 6, 2);
	      head10.setRotationPoint(4F, -2.5F, -1F);
	      head10.setTextureSize(64, 64);
	      head10.mirror = true;
	      setRotation(head10, -1.308997F, 0.1308997F, 0F);
	      head11 = new ModelRenderer(this, 48, 16);
	      head11.addBox(-1F, -7F, -1F, 2, 7, 2);
	      head11.setRotationPoint(-3F, -2F, -4F);
	      head11.setTextureSize(64, 64);
	      head11.mirror = true;
	      setRotation(head11, 0.1308997F, 0.7853982F, 0F);
	      head12 = new ModelRenderer(this, 56, 16);
	      head12.addBox(-1F, -6F, -1F, 2, 4, 2);
	      head12.setRotationPoint(-3.5F, 0F, -3F);
	      head12.setTextureSize(64, 64);
	      head12.mirror = true;
	      setRotation(head12, 0.1308997F, 1.047198F, -0.2617994F);
	      head13 = new ModelRenderer(this, 56, 16);
	      head13.addBox(-1F, -6F, -1F, 2, 4, 2);
	      head13.setRotationPoint(3.5F, 0F, -3F);
	      head13.setTextureSize(64, 64);
	      head13.mirror = true;
	      setRotation(head13, 0.1308997F, -1.047198F, 0.2617994F);
	      head14 = new ModelRenderer(this, 48, 16);
	      head14.addBox(-1F, -4F, -1F, 2, 6, 2);
	      head14.setRotationPoint(3.75F, -4F, -1F);
	      head14.setTextureSize(64, 64);
	      head14.mirror = true;
	      setRotation(head14, 0.1308997F, -1.308997F, 0.5235988F);
	      head15 = new ModelRenderer(this, 48, 16);
	      head15.addBox(-1F, -6F, -1F, 2, 4, 2);
	      head15.setRotationPoint(2F, -2F, -5F);
	      head15.setTextureSize(64, 64);
	      head15.mirror = true;
	      setRotation(head15, 0.1308997F, -0.2617994F, 0F);
	      head16 = new ModelRenderer(this, 0, 16);
	      head16.addBox(-1F, -6F, -1F, 2, 6, 2);
	      head16.setRotationPoint(-4F, -2.5F, -1F);
	      head16.setTextureSize(64, 64);
	      head16.mirror = true;
	      setRotation(head16, -1.308997F, -0.1308997F, 0F);
	      head17 = new ModelRenderer(this, 0, 16);
	      head17.addBox(-1F, -8F, -1F, 2, 8, 2);
	      head17.setRotationPoint(-2F, -7.5F, -5F);
	      head17.setTextureSize(64, 64);
	      head17.mirror = true;
	      setRotation(head17, -1.047198F, -0.2617994F, 0F);
	      chest1 = new ModelRenderer(this, 16, 16);
	      chest1.addBox(-2F, -4F, -1F, 4, 4, 2);
	      chest1.setRotationPoint(3F, 11F, 0F);
	      chest1.setTextureSize(64, 64);
	      chest1.mirror = true;
	      setRotation(chest1, 0.5235988F, -1.570796F, 0F);
	      chest2 = new ModelRenderer(this, 16, 16);
	      chest2.addBox(-2F, -8F, -1F, 4, 8, 2);
	      chest2.setRotationPoint(-1F, 10F, 2F);
	      chest2.setTextureSize(64, 64);
	      chest2.mirror = true;
	      setRotation(chest2, 0.1308997F, 2.879793F, 0.3926991F);
	      chest3 = new ModelRenderer(this, 16, 16);
	      chest3.addBox(-2F, -8F, -1F, 4, 8, 2);
	      chest3.setRotationPoint(1F, 10F, 2F);
	      chest3.setTextureSize(64, 64);
	      chest3.mirror = true;
	      setRotation(chest3, 0.1308997F, -2.879793F, -0.3926991F);
	      chest4 = new ModelRenderer(this, 16, 16);
	      chest4.addBox(-2F, -4F, -1F, 4, 4, 2);
	      chest4.setRotationPoint(-3F, 11F, 0F);
	      chest4.setTextureSize(64, 64);
	      chest4.mirror = true;
	      setRotation(chest4, 0.5235988F, 1.570796F, 0F);
	      chest5 = new ModelRenderer(this, 16, 16);
	      chest5.addBox(-2F, -8F, -1F, 4, 8, 2);
	      chest5.setRotationPoint(-1F, 10F, -2F);
	      chest5.setTextureSize(64, 64);
	      chest5.mirror = true;
	      setRotation(chest5, 0.1308997F, 0.2617994F, -0.3926991F);
	      chest6 = new ModelRenderer(this, 16, 16);
	      chest6.addBox(-2F, -8F, -1F, 4, 8, 2);
	      chest6.setRotationPoint(0F, 9F, -2F);
	      chest6.setTextureSize(64, 64);
	      chest6.mirror = true;
	      setRotation(chest6, 0.2617994F, 0F, 0F);
	      chest7 = new ModelRenderer(this, 16, 16);
	      chest7.addBox(-2F, -4F, -1F, 4, 4, 2);
	      chest7.setRotationPoint(0F, 11F, 2F);
	      chest7.setTextureSize(64, 64);
	      chest7.mirror = true;
	      setRotation(chest7, 0.5235988F, 3.141593F, 0F);
	      chest8 = new ModelRenderer(this, 16, 16);
	      chest8.addBox(-2F, -8F, -1F, 4, 8, 2);
	      chest8.setRotationPoint(1F, 10F, -2F);
	      chest8.setTextureSize(64, 64);
	      chest8.mirror = true;
	      setRotation(chest8, 0.1308997F, -0.2617994F, 0.3926991F);
	      chest9 = new ModelRenderer(this, 16, 16);
	      chest9.addBox(-2F, -4F, -1F, 4, 4, 2);
	      chest9.setRotationPoint(0F, 11F, -2F);
	      chest9.setTextureSize(64, 64);
	      chest9.mirror = true;
	      setRotation(chest9, 0.5235988F, 0F, 0F);
	      chest10 = new ModelRenderer(this, 8, 16);
	      chest10.addBox(-1F, -4F, -1F, 2, 4, 2);
	      chest10.setRotationPoint(-2.5F, 7F, -1F);
	      chest10.setTextureSize(64, 64);
	      chest10.mirror = true;
	      setRotation(chest10, -1.832596F, -2.879793F, 0F);
	      chest11 = new ModelRenderer(this, 8, 16);
	      chest11.addBox(-1F, -4F, -1F, 2, 4, 2);
	      chest11.setRotationPoint(-2.5F, 5F, -2F);
	      chest11.setTextureSize(64, 64);
	      chest11.mirror = true;
	      setRotation(chest11, -1.308997F, -2.879793F, 0F);
	      chest12 = new ModelRenderer(this, 8, 16);
	      chest12.addBox(-1F, -4F, -1F, 2, 4, 2);
	      chest12.setRotationPoint(2.5F, 5F, -2F);
	      chest12.setTextureSize(64, 64);
	      chest12.mirror = true;
	      setRotation(chest12, -1.308997F, 2.879793F, 0F);
	      chest13 = new ModelRenderer(this, 8, 16);
	      chest13.addBox(-1F, -4F, -1F, 2, 4, 2);
	      chest13.setRotationPoint(2.5F, 7F, -1F);
	      chest13.setTextureSize(64, 64);
	      chest13.mirror = true;
	      setRotation(chest13, -1.832596F, 2.879793F, 0F);
	      armR1 = new ModelRenderer(this, 32, 16);
	      armR1.addBox(-2F, -4F, -1F, 4, 4, 2);
	      armR1.setRotationPoint(-7.5F, 8F, 0F);
	      armR1.setTextureSize(64, 64);
	      armR1.mirror = true;
	      setRotation(armR1, 0F, 1.570796F, 0F);
	      armR2 = new ModelRenderer(this, 8, 16);
	      armR2.addBox(-1F, -4F, -1F, 2, 4, 2);
	      armR2.setRotationPoint(-6F, 0F, 0F);
	      armR2.setTextureSize(64, 64);
	      armR2.mirror = true;
	      setRotation(armR2, -0.7853982F, 0F, -0.3926991F);
	      armR3 = new ModelRenderer(this, 8, 16);
	      armR3.addBox(-1F, -4F, -1F, 2, 4, 2);
	      armR3.setRotationPoint(-6F, 0F, -1F);
	      armR3.setTextureSize(64, 64);
	      armR3.mirror = true;
	      setRotation(armR3, -0.2617994F, 0F, -0.1308997F);
	      armR4 = new ModelRenderer(this, 48, 16);
	      armR4.addBox(-1F, 0F, -1F, 2, 7, 2);
	      armR4.setRotationPoint(-7F, 9F, 0F);
	      armR4.setTextureSize(64, 64);
	      armR4.mirror = true;
	      setRotation(armR4, 0.1308997F, 1.570796F, 3.141593F);
	      armR5 = new ModelRenderer(this, 16, 32);
	      armR5.addBox(-2F, -4F, -2F, 4, 4, 4);
	      armR5.setRotationPoint(-5F, 3F, 0F);
	      armR5.setTextureSize(64, 64);
	      armR5.mirror = true;
	      setRotation(armR5, 0.2617994F, 1.570796F, 0F);
	      armR6 = new ModelRenderer(this, 0, 16);
	      armR6.addBox(-1F, -6F, -1F, 2, 6, 2);
	      armR6.setRotationPoint(-6.5F, 4F, 0F);
	      armR6.setTextureSize(64, 64);
	      armR6.mirror = true;
	      setRotation(armR6, -1.047198F, -0.3926991F, 0F);
	      armL1 = new ModelRenderer(this, 16, 32);
	      armL1.addBox(-2F, -4F, -2F, 4, 4, 4);
	      armL1.setRotationPoint(5F, 3F, 0F);
	      armL1.setTextureSize(64, 64);
	      armL1.mirror = true;
	      setRotation(armL1, -0.2617994F, 1.570796F, 0F);
	      armL2 = new ModelRenderer(this, 48, 16);
	      armL2.addBox(-1F, 0F, -1F, 2, 7, 2);
	      armL2.setRotationPoint(7F, 9F, 0F);
	      armL2.setTextureSize(64, 64);
	      armL2.mirror = true;
	      setRotation(armL2, -0.1308997F, 1.570796F, 3.141593F);
	      armL3 = new ModelRenderer(this, 32, 16);
	      armL3.addBox(-2F, -4F, -1F, 4, 4, 2);
	      armL3.setRotationPoint(7.5F, 8F, 0F);
	      armL3.setTextureSize(64, 64);
	      armL3.mirror = true;
	      setRotation(armL3, 0F, -1.570796F, 0F);
	      armL4 = new ModelRenderer(this, 0, 16);
	      armL4.addBox(-1F, -6F, -1F, 2, 6, 2);
	      armL4.setRotationPoint(6.5F, 4F, 0F);
	      armL4.setTextureSize(64, 64);
	      armL4.mirror = true;
	      setRotation(armL4, -1.047198F, 0.3926991F, 0F);
	      armL5 = new ModelRenderer(this, 8, 16);
	      armL5.addBox(-1F, -4F, -1F, 2, 4, 2);
	      armL5.setRotationPoint(6F, 0F, 0F);
	      armL5.setTextureSize(64, 64);
	      armL5.mirror = true;
	      setRotation(armL5, -0.7853982F, 0F, 0.3926991F);
	      armL6 = new ModelRenderer(this, 8, 16);
	      armL6.addBox(-1F, -4F, -1F, 2, 4, 2);
	      armL6.setRotationPoint(6F, 0F, -1F);
	      armL6.setTextureSize(64, 64);
	      armL6.mirror = true;
	      setRotation(armL6, -0.2617994F, 0F, 0.1308997F);
	      legR1 = new ModelRenderer(this, 32, 16);
	      legR1.addBox(-2F, -4F, -1F, 4, 4, 2);
	      legR1.setRotationPoint(-2.5F, 18F, -2.5F);
	      legR1.setTextureSize(64, 64);
	      legR1.mirror = true;
	      setRotation(legR1, 0.1308997F, 0F, 0F);
	      legR2 = new ModelRenderer(this, 32, 16);
	      legR2.addBox(-1F, 0F, -1F, 2, 4, 2);
	      legR2.setRotationPoint(-2.5F, 21F, -2F);
	      legR2.setTextureSize(64, 64);
	      legR2.mirror = true;
	      setRotation(legR2, 0F, 0F, 3.141593F);
	      legR3 = new ModelRenderer(this, 32, 16);
	      legR3.addBox(-1F, -4F, -1F, 2, 4, 2);
	      legR3.setRotationPoint(-2.5F, 15F, -2F);
	      legR3.setTextureSize(64, 64);
	      legR3.mirror = true;
	      setRotation(legR3, 0.1308997F, 0F, 0F);
	      legR4 = new ModelRenderer(this, 8, 16);
	      legR4.addBox(-1F, -4F, -1F, 2, 4, 2);
	      legR4.setRotationPoint(-3F, 14F, -2F);
	      legR4.setTextureSize(64, 64);
	      legR4.mirror = true;
	      setRotation(legR4, -1.047198F, -2.617994F, 0F);
	      legR5 = new ModelRenderer(this, 8, 16);
	      legR5.addBox(-1F, -4F, -1F, 2, 4, 2);
	      legR5.setRotationPoint(-3F, 14F, -1F);
	      legR5.setTextureSize(64, 64);
	      legR5.mirror = true;
	      setRotation(legR5, -1.047198F, -1.832596F, 0F);
	      legR6 = new ModelRenderer(this, 32, 16);
	      legR6.addBox(-2F, 0F, -1F, 4, 4, 2);
	      legR6.setRotationPoint(-4F, 14F, -0.5F);
	      legR6.setTextureSize(64, 64);
	      legR6.mirror = true;
	      setRotation(legR6, -0.2617994F, 1.570796F, 0F);
	      legL1 = new ModelRenderer(this, 32, 16);
	      legL1.addBox(-2F, -4F, -1F, 4, 4, 2);
	      legL1.setRotationPoint(2.5F, 18F, -2.5F);
	      legL1.setTextureSize(64, 64);
	      legL1.mirror = true;
	      setRotation(legL1, 0.1308997F, 0F, 0F);
	      legL2 = new ModelRenderer(this, 32, 16);
	      legL2.addBox(-1F, 0F, -1F, 2, 4, 2);
	      legL2.setRotationPoint(2.5F, 21F, -2F);
	      legL2.setTextureSize(64, 64);
	      legL2.mirror = true;
	      setRotation(legL2, 0F, 0F, 3.141593F);
	      legL3 = new ModelRenderer(this, 32, 16);
	      legL3.addBox(-1F, -4F, -1F, 2, 4, 2);
	      legL3.setRotationPoint(2.5F, 15F, -2F);
	      legL3.setTextureSize(64, 64);
	      legL3.mirror = true;
	      setRotation(legL3, 0.1308997F, 0F, 0F);
	      legL4 = new ModelRenderer(this, 8, 16);
	      legL4.addBox(-1F, -4F, -1F, 2, 4, 2);
	      legL4.setRotationPoint(3F, 14F, -2F);
	      legL4.setTextureSize(64, 64);
	      legL4.mirror = true;
	      setRotation(legL4, -1.047198F, 2.617994F, 0F);
	      legL5 = new ModelRenderer(this, 8, 16);
	      legL5.addBox(-1F, -4F, -1F, 2, 4, 2);
	      legL5.setRotationPoint(3F, 14F, -1F);
	      legL5.setTextureSize(64, 64);
	      legL5.mirror = true;
	      setRotation(legL5, -1.047198F, 1.832596F, 0F);
	      legL6 = new ModelRenderer(this, 32, 16);
	      legL6.addBox(-2F, 0F, -1F, 4, 4, 2);
	      legL6.setRotationPoint(4F, 14F, -0.5F);
	      legL6.setTextureSize(64, 64);
	      legL6.mirror = true;
	      setRotation(legL6, -0.2617994F, -1.570796F, 0F);
	      bootR1 = new ModelRenderer(this, 16, 32);
	      bootR1.addBox(-2F, -4F, -2F, 4, 4, 4);
	      bootR1.setRotationPoint(-2F, 24F, -2F);
	      bootR1.setTextureSize(64, 64);
	      bootR1.mirror = true;
	      setRotation(bootR1, 0F, 0F, 0F);
	      bootR2 = new ModelRenderer(this, 32, 16);
	      bootR2.addBox(-1F, -4F, -1F, 2, 4, 2);
	      bootR2.setRotationPoint(-3F, 21F, -1F);
	      bootR2.setTextureSize(64, 64);
	      bootR2.mirror = true;
	      setRotation(bootR2, -1.047198F, -0.5235988F, 0F);
	      bootR3 = new ModelRenderer(this, 32, 16);
	      bootR3.addBox(-1F, -4F, -1F, 2, 4, 2);
	      bootR3.setRotationPoint(-3F, 21F, -1F);
	      bootR3.setTextureSize(64, 64);
	      bootR3.mirror = true;
	      setRotation(bootR3, -1.832596F, -0.7853982F, 0F);
	      bootL1 = new ModelRenderer(this, 16, 32);
	      bootL1.addBox(-2F, -4F, -2F, 4, 4, 4);
	      bootL1.setRotationPoint(2F, 24F, -2F);
	      bootL1.setTextureSize(64, 64);
	      bootL1.mirror = true;
	      setRotation(bootL1, 0F, 0F, 0F);
	      bootL2 = new ModelRenderer(this, 32, 16);
	      bootL2.addBox(-1F, -4F, -1F, 2, 4, 2);
	      bootL2.setRotationPoint(3F, 21F, -1F);
	      bootL2.setTextureSize(64, 64);
	      bootL2.mirror = true;
	      setRotation(bootL2, -1.047198F, 0.5235988F, 0F);
	      bootL3 = new ModelRenderer(this, 32, 16);
	      bootL3.addBox(-1F, -4F, -1F, 2, 4, 2);
	      bootL3.setRotationPoint(3F, 21F, -1F);
	      bootL3.setTextureSize(64, 64);
	      bootL3.mirror = true;
	      setRotation(bootL3, -1.832596F, 0.7853982F, 0F);
	    head = new ModelRenderer(this);
	    head.addChild(head1);
	    head.addChild(head2);
	    head.addChild(head3);
	    head.addChild(head4);
	    head.addChild(head5);
	    head.addChild(head6);
	    head.addChild(head7);
	    head.addChild(head8);
	    head.addChild(head9);
	    head.addChild(head10);
	    head.addChild(head11);
	    head.addChild(head12);
	    head.addChild(head13);
	    head.addChild(head14);
	    head.addChild(head15);
	    head.addChild(head16);
	    head.addChild(head17);
	    
	    chest = new ModelRenderer(this);
	    chest.addChild(chest1);
	    chest.addChild(chest2);
	    chest.addChild(chest3);
	    chest.addChild(chest4);
	    chest.addChild(chest5);
	    chest.addChild(chest6);
	    chest.addChild(chest7);
	    chest.addChild(chest8);
	    chest.addChild(chest9);
	    chest.addChild(chest10);
	    chest.addChild(chest11);
	    chest.addChild(chest12);
	    chest.addChild(chest13);
	    for (int i = 0; i < chest.childModels.size(); i ++){
	    	chest.childModels.get(i).rotationPointY -= 1;
	    }
	    
	    armR = new ModelRenderer(this);
	    armR.addChild(armR1);
	    armR.addChild(armR2);
	    armR.addChild(armR3);
	    armR.addChild(armR4);
	    armR.addChild(armR5);
	    armR.addChild(armR6);
	    
	    armL = new ModelRenderer(this);
	    armL.addChild(armL1);
	    armL.addChild(armL2);
	    armL.addChild(armL3);
	    armL.addChild(armL4);
	    armL.addChild(armL5);
	    armL.addChild(armL6);
	    
	    legR = new ModelRenderer(this);
	    legR.setRotationPoint(0, -12, 0);
	    legR.addChild(legR1);
	    legR.addChild(legR2);
	    legR.addChild(legR3);
	    legR.addChild(legR4);
	    legR.addChild(legR5);
	    legR.addChild(legR6);
	    for (int i = 0; i < legR.childModels.size(); i ++){
	    	legR.childModels.get(i).rotationPointY -= 12;
	    }
	    
	    legL = new ModelRenderer(this);
	    legL.setRotationPoint(0, -12, 0);
	    legL.addChild(legL1);
	    legL.addChild(legL2);
	    legL.addChild(legL3);
	    legL.addChild(legL4);
	    legL.addChild(legL5);
	    legL.addChild(legL6);
	    for (int i = 0; i < legL.childModels.size(); i ++){
	    	legL.childModels.get(i).rotationPointY -= 12;
	    }
	    
	    bootR = new ModelRenderer(this);
	    bootR.setRotationPoint(0, -12, 0);
	    bootR.addChild(bootR1);
	    bootR.addChild(bootR2);
	    bootR.addChild(bootR3);
	    for (int i = 0; i < bootR.childModels.size(); i ++){
	    	bootR.childModels.get(i).rotationPointY -= 12;
	    }
	    
	    bootL = new ModelRenderer(this);
	    bootL.setRotationPoint(0, -12, 0);
	    bootL.addChild(bootL1);
	    bootL.addChild(bootL2);
	    bootL.addChild(bootL3);
	    for (int i = 0; i < bootL.childModels.size(); i ++){
	    	bootL.childModels.get(i).rotationPointY -= 12;
	    }
	    this.armorScale = 1.2f;
	}
}
