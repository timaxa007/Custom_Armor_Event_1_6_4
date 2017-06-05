package timaxa007.test_armor_obj;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import timaxa007.test_armor_obj.client.model.ArmorCustomModel;

public class ItemArmorDummy extends ItemArmor {

	public ItemArmorDummy(int id, EnumArmorMaterial armorMaterial, int partArmor) {
		super(id, armorMaterial, 0, partArmor);
	}

	@SideOnly(Side.CLIENT)
	public ArmorCustomModel getModel(EntityPlayer entityPlayer, ItemStack stack, int slot) {
		return null;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
		ModelBiped model = new ModelBiped();
		model.bipedHead.showModel = 
				model.bipedHeadwear.showModel = 
				model.bipedBody.showModel = 
				model.bipedRightArm.showModel = 
				model.bipedLeftArm.showModel = 
				model.bipedRightLeg.showModel = 
				model.bipedLeftLeg.showModel = false;
		return model;
	}

}
