package timaxa007.test_armor_obj.client;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.ForgeSubscribe;
import timaxa007.test_armor_obj.ItemArmorDummy;
import timaxa007.test_armor_obj.client.model.ArmorCustomModel;

public class EventsClient {

	@ForgeSubscribe
	public void onRenderArmomForPlayer(RenderPlayerEvent.SetArmorModel event) {
		if (event.stack == null || !(event.stack.getItem() instanceof ItemArmorDummy)) return;
		ItemArmorDummy ivcad = (ItemArmorDummy)event.stack.getItem();
		ArmorCustomModel acm = ivcad.getModel(event.entityPlayer, event.stack, 3 - event.slot);
		if (acm != null) {
			ModelBiped modelBipedMain = ReflectionHelper.getPrivateValue(RenderPlayer.class, event.renderer, "modelBipedMain", "field_77109_a", "f");
			acm.partHead.set(modelBipedMain.bipedHead);
			acm.partBody.set(modelBipedMain.bipedBody);
			acm.partRightArm.set(modelBipedMain.bipedRightArm);
			acm.partLeftArm.set(modelBipedMain.bipedLeftArm);		
			acm.partRightLeg.set(modelBipedMain.bipedRightLeg);
			acm.partLeftLeg.set(modelBipedMain.bipedLeftLeg);
			acm.render(event.entityPlayer);
		}
	}

}
