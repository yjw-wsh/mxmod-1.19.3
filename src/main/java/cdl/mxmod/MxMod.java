package cdl.mxmod;

import cdl.mxmod.enchant.AllEnchanments;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MxMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String modid = "mxmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("mxmod");


	@Override
	public void onInitialize() {

		LOGGER.info("[cdl] Load More Enchantment.");
		AllEnchanments.RegistryAllEnchanments();
		LOGGER.info("[cdl] Load More Items");
		LOGGER.info("[cdl] Mx Mod has loaded successfully.");
	}
}