package circle.blue;

import circle.blue.blocks.myblocks;
import circle.blue.blocks.myvanillers;
import circle.blue.custommobs.EntityRegister;
import circle.blue.datagenerators.dimensionmaker;
import circle.blue.features.myfeatures;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static circle.blue.item.myitems.registermyitens;
import static circle.blue.mycreative_mode_tab.inicializecreativemenu;

public class Circle implements ModInitializer {
	public static final String MOD_ID = "circle";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		myblocks.registerModBlocks();
		myvanillers.registermyvanillers();
		inicializecreativemenu();
		registermyitens();
		MyTags.registertags();
		dimensionmaker.dimensionmaker();
		myfeatures.registring();
		EntityRegister.registerModEntityTypes();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
