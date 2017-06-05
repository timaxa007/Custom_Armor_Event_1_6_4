package timaxa007.test_armor_obj;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import timaxa007.test_armor_obj.client.model.ArmorCustomModel;
import timaxa007.test_armor_obj.client.model.ArmorTestModel;

public class ItemArmorTestObj extends ItemArmorDummy {

	public ItemArmorTestObj(int id, EnumArmorMaterial armorMaterial, int partArmor) {
		super(id, armorMaterial, partArmor);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ArmorCustomModel getModel(EntityPlayer entityPlayer, ItemStack is, int armorSlot) {
		ArmorCustomModel armorModel = new ArmorTestModel(armorSlot);
		if (hasColor(is) && armorModel instanceof ArmorCustomModel) ((ArmorCustomModel)armorModel).color = getColor(is);
		return armorModel;
	}

}
