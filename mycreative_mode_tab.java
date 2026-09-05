package circle.blue;

import circle.blue.blocks.myblocks;
import circle.blue.blocks.myvanillers;
import circle.blue.item.myitems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class mycreative_mode_tab {
    public static final CreativeModeTab BLUE_ITEMS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Circle.MOD_ID, "blue_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(myblocks.MOONY_DUST))
                    .title(Component.empty())
                    .displayItems((parameters, output ) ->{
                        output.accept(myvanillers.TERRACOTTA_SLAB);
                        output.accept(myvanillers.TERRACOTTA_STAIRS);
                        output.accept(myvanillers.TERRACOTTA_WALL);
                        output.accept(myvanillers.BLACK_TERRACOTTA_SLAB);
                        output.accept(myvanillers.BLACK_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.BLACK_TERRACOTTA_WALL);
                        output.accept(myvanillers.GRAY_TERRACOTTA_SLAB);
                        output.accept(myvanillers.GRAY_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.GRAY_TERRACOTTA_WALL);
                        output.accept(myvanillers.LIGHT_GRAY_TERRACOTTA_SLAB);
                        output.accept(myvanillers.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.LIGHT_GRAY_TERRACOTTA_WALL);
                        output.accept(myvanillers.WHITE_TERRACOTTA_SLAB);
                        output.accept(myvanillers.WHITE_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.WHITE_TERRACOTTA_WALL);
                        output.accept(myvanillers.PURPLE_TERRACOTTA_SLAB);
                        output.accept(myvanillers.PURPLE_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.PURPLE_TERRACOTTA_WALL);
                        output.accept(myvanillers.BLUE_TERRACOTTA_SLAB);
                        output.accept(myvanillers.BLUE_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.BLUE_TERRACOTTA_WALL);
                        output.accept(myvanillers.LIGHT_BLUE_TERRACOTTA_SLAB);
                        output.accept(myvanillers.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.LIGHT_BLUE_TERRACOTTA_WALL);
                        output.accept(myvanillers.LIME_TERRACOTTA_SLAB);
                        output.accept(myvanillers.LIME_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.LIME_TERRACOTTA_WALL);
                        output.accept(myvanillers.GREEN_TERRACOTTA_SLAB);
                        output.accept(myvanillers.GREEN_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.GREEN_TERRACOTTA_WALL);
                        output.accept(myvanillers.YELLOW_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.YELLOW_TERRACOTTA_WALL);
                        output.accept(myvanillers.YELLOW_TERRACOTTA_SLAB);
                        output.accept(myvanillers.ORANGE_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.ORANGE_TERRACOTTA_WALL);
                        output.accept(myvanillers.ORANGE_TERRACOTTA_SLAB);
                        output.accept(myvanillers.RED_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.RED_TERRACOTTA_WALL);
                        output.accept(myvanillers.RED_TERRACOTTA_SLAB);
                        output.accept(myvanillers.PINK_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.PINK_TERRACOTTA_WALL);
                        output.accept(myvanillers.PINK_TERRACOTTA_SLAB);
                        output.accept(myvanillers.MAGENTA_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.MAGENTA_TERRACOTTA_WALL);
                        output.accept(myvanillers.MAGENTA_TERRACOTTA_SLAB);
                        output.accept(myvanillers.BROWN_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.BROWN_TERRACOTTA_WALL);
                        output.accept(myvanillers.BROWN_TERRACOTTA_SLAB);
                        output.accept(myvanillers.CYAN_TERRACOTTA_STAIRS);
                        output.accept(myvanillers.CYAN_TERRACOTTA_WALL);
                        output.accept(myvanillers.CYAN_TERRACOTTA_SLAB);
                        output.accept(myblocks.DARK_OAK_BOOKSHELF);
                        output.accept(myblocks.BLUE_BRENCH);
                        output.accept(myitems.COBALT_AXE);
                        output.accept(myitems.COBALT_INGOT);
                        output.accept(myitems.RAW_COBALT);
                        output.accept(myitems.METAL_SCRAPS);
                        output.accept(myitems.COBALT_SWORD);
                        output.accept(myitems.COBALT_PICKAXE);
                        output.accept(myitems.COBALT_SHOVEL);
                        output.accept(myitems.COBALT_HOE);
                        output.accept(myvanillers.INDIGO_FADESTONE);
                        output.accept(myvanillers.CERULEAN_FADESTONE);
                        output.accept(myvanillers.TURQUOISE_FADESTONE);
                        output.accept(myvanillers.TEAL_FADESTONE);
                        output.accept(myvanillers.SAGE_FADESTONE);
                        output.accept(myvanillers.OLIVE_FADESTONE);
                        output.accept(myvanillers.SAFFRON_FADESTONE);
                        output.accept(myvanillers.CORAL_FADESTONE);
                        output.accept(myvanillers.SCARLET_FADESTONE);
                        output.accept(myvanillers.ROSE_FADESTONE);
                        output.accept(myvanillers.FUCHSIA_FADESTONE);
                        output.accept(myvanillers.VIOLET_FADESTONE);

                        output.accept(myblocks.BISMUTH);
                        output.accept(myblocks.BISMUTH_SLAB);
                        output.accept(myblocks.BISMUTH_TILE);

                        output.accept(myitems.CIRCLE_SWORD);
                        output.accept(myitems.BRUTE_SWORD);
                        output.accept(myitems.STAR_SWORD);
                        output.accept(myitems.SLIM_SWORD);
                        output.accept(myitems.FAST_SWORD);
                        output.accept(myitems.FLOWER_SWORD);
                    }).build());
    public static void inicializecreativemenu(){}
}