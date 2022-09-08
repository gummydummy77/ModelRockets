package net.fabricmc.modelrockets;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.modelrockets.main.ItemsInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelRockets implements ModInitializer {

	public static ItemsInitializer ITEMS_INITIALIZER = new ItemsInitializer();

	@Override
	public void onInitialize() {
		ITEMS_INITIALIZER.Initialize();
	}
}
