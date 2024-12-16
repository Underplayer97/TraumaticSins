package io.github.underplayer97.traumaticsins;

import io.github.underplayer97.traumaticsins.block.SinsBlocks;
import io.github.underplayer97.traumaticsins.block.entity.SinsBlockEntity;
import io.github.underplayer97.traumaticsins.item.SinsItemGroups;
import io.github.underplayer97.traumaticsins.item.SinsItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class SinsMain implements ModInitializer {

	public static final String MOD_ID = "traumaticsins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("You will burn in your own sins...");

		GeckoLib.initialize();
		SinsBlocks.registerSinsBlocks();
		SinsItems.registerSinsItems();
		SinsItemGroups.registerSinsBlockGroups();
		SinsBlockEntity.registerBlockEntity();

	}
}