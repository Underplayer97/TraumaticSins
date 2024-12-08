package io.github.underplayer97.traumaticsins;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SinsMain implements ModInitializer {

	public static final String MOD_ID = "traumaticsins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("You will burn in your own sins...");

	}
}