package timaxa007.test_armor_obj.client;

import net.minecraftforge.common.MinecraftForge;

public class ProxyClient extends timaxa007.test_armor_obj.ProxyServer {

	public void init() {
		MinecraftForge.EVENT_BUS.register(new EventsClient());
	}

}
