package circle.blue.blocks;

import circle.blue.Circle;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class myvanillers extends Block {
    public myvanillers(Properties properties) {
        super(properties);
    }

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs", properties -> new StairBlock(
            Blocks.PURPLE_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs", properties -> new StairBlock(
            Blocks.BLUE_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs", properties -> new StairBlock(
            Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs", properties -> new StairBlock(
            Blocks.GREEN_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs", properties -> new StairBlock(
            Blocks.LIME_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs", properties -> new StairBlock(
            Blocks.YELLOW_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs", properties -> new StairBlock(
            Blocks.ORANGE_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs", properties -> new StairBlock(
            Blocks.RED_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs", properties -> new StairBlock(
            Blocks.PINK_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs", properties -> new StairBlock(
            Blocks.MAGENTA_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs", properties -> new StairBlock(
            Blocks.CYAN_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs", properties -> new StairBlock(
            Blocks.WHITE_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs", properties -> new StairBlock(
            Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs", properties -> new StairBlock(
            Blocks.GRAY_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs", properties -> new StairBlock(
            Blocks.BLACK_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs", properties -> new StairBlock(
            Blocks.BROWN_TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", properties -> new StairBlock(
            Blocks.TERRACOTTA.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block BLACKSTONE_PATH = registerBlock("blackstone_path", properties -> new PathrockBlock(
        properties.strength(0.2F).noCollision()
));
    public static final Block STONE_PATH = registerBlock("stone_path", properties -> new PathrockBlock(
            properties.strength(0.2F).noCollision()
    ));
    public static final Block TUFF_PATH = registerBlock("tuff_path", properties -> new PathrockBlock(
            properties.strength(0.2F).noCollision()
    ));
    public static final Block ENDSTONE_PATH = registerBlock("endstone_path", properties -> new PathrockBlock(
            properties.strength(0.2F).noCollision()
    ));
    public static final Block DEEPSLATE_PATH = registerBlock("deepslate_path", properties -> new PathrockBlock(
            properties.strength(0.2F).noCollision()
    ));



    public static final Block SCARLET_FADESTONE  = registerBlock("scarlet_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block CORAL_FADESTONE  = registerBlock("coral_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block SAFFRON_FADESTONE  = registerBlock("saffron_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block OLIVE_FADESTONE  = registerBlock("olive_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block SAGE_FADESTONE  = registerBlock("sage_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block TEAL_FADESTONE  = registerBlock("teal_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block TURQUOISE_FADESTONE  = registerBlock("turquoise_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block CERULEAN_FADESTONE  = registerBlock("cerulean_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block INDIGO_FADESTONE  = registerBlock("indigo_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block VIOLET_FADESTONE  = registerBlock("violet_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block ROSE_FADESTONE  = registerBlock("rose_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block FUCHSIA_FADESTONE  = registerBlock("fuchsia_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_SCARLET_FADESTONE  = registerBlock("ditched_scarlet_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_CORAL_FADESTONE  = registerBlock("ditched_coral_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_SAFFRON_FADESTONE  = registerBlock("ditched_saffron_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_OLIVE_FADESTONE  = registerBlock("ditched_olive_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_SAGE_FADESTONE  = registerBlock("ditched_sage_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_TEAL_FADESTONE  = registerBlock("ditched_teal_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_TURQUOISE_FADESTONE  = registerBlock("ditched_turquoise_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_CERULEAN_FADESTONE  = registerBlock("ditched_cerulean_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_INDIGO_FADESTONE  = registerBlock("ditched_indigo_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_VIOLET_FADESTONE  = registerBlock("ditched_violet_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_ROSE_FADESTONE  = registerBlock("ditched_rose_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block DITCHED_FUCHSIA_FADESTONE  = registerBlock("ditched_fuchsia_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));








    private static Block registerBlock(String name, Function<Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create( Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(Circle.MOD_ID, name)      )));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Circle.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Circle.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(
                        Registries.ITEM, Identifier.fromNamespaceAndPath(Circle.MOD_ID, name)
                ))));
    }

    public static void registermyvanillers(){

    }
}

