package circle.blue.blocks;


import circle.blue.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;


public class myblocks {
//Fadeblocks
    public static final Block FADESTONE  = registerBlock("fadestone", properties -> new Block(
            properties.strength(0.2f)
            ));
    public static final Block DARK_FADESTONE  = registerBlock("dark_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block LIGHT_FADESTONE  = registerBlock("light_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_GLASS  = registerBlock("fadestone_glass", properties -> new TransparentBlock(
            properties.strength(0.2f).noOcclusion()
    ));
    public static final Block FADESTONE_LAYERED  = registerBlock("fadestone_layered", properties -> new StrangeFlower(
            properties.strength(0.2f)
    ));
    public static final Block SMOOTH_FADESTONE  = registerBlock("smooth_fadestone", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_BRICKS  = registerBlock("fadestone_bricks", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_TILES  = registerBlock("fadestone_tiles", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_PILLAR  = registerBlock("fadestone_pillar", properties -> new RotatedPillarBlock(
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_BARS  = registerBlock("fadestone_bars", properties -> new IronBarsBlock(
            properties.strength(0.2f)
    ));

    public static final Block POTTY  = registerBlock("potty", properties -> new pottyBlock(
            properties.strength(1.3f).noOcclusion()
    ));


    public static final Block BISMUTH  = registerBlock("bismuth", properties -> new Block(
            properties.strength(1.3f).noOcclusion().lightLevel(state -> 13)
    ));
    public static final Block PURPLE_BUSH = registerBlock("purple_bush", properties -> new Block(
            properties.strength(1.3f)
    ));
    public static final Block BISMUTH_TILE  = registerBlock("bismuth_tile", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block WHY = registerBlock("why", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block BISMUTH_SLAB  = registerBlock("bismuth_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block POINTED_FADESTONE = registerBlock("pointed_fadestone", properties -> new pointyBlock(
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_STAIRS = registerBlock("fadestone_stairs", properties -> new StairBlock(
            myblocks.FADESTONE.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_SLAB = registerBlock("fadestone_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block FADESTONE_WALL = registerBlock("fadestone_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
    public static final Block INDIGO_POINTED_FADESTONE = registerBlock("indigo_pointed_fadestone", properties -> new pointyBlock(
            properties.strength(0.2f)
    ));
    public static final Block TURQUOISE_POINTED_FADESTONE = registerBlock("turquoise_pointed_fadestone", properties -> new pointyBlock(
            properties.strength(0.2f)
    ));
    public static final Block SAGE_POINTED_FADESTONE = registerBlock("sage_pointed_fadestone", properties -> new pointyBlock(
            properties.strength(0.2f)
    ));
    public static final Block SAFFRON_POINTED_FADESTONE = registerBlock("saffron_pointed_fadestone", properties -> new pointyBlock(
            properties.strength(0.2f)
    ));
    public static final Block SCARLET_POINTED_FADESTONE = registerBlock("scarlet_pointed_fadestone", properties -> new pointyBlock(
            properties.strength(0.2f)
    ));
    public static final Block FUCHSIA_POINTED_FADESTONE = registerBlock("fuchsia_pointed_fadestone", properties -> new pointyBlock(
            properties.strength(0.2f)
    ));




    public static final Block OLDWOOD  = registerBlock("oldwood", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block OLDWOOD_STAIRS = registerBlock("oldwood_stairs", properties -> new StairBlock(
            myblocks.OLDWOOD.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block OLDWOOD_SLAB = registerBlock("oldwood_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block OLDWOOD_WALL = registerBlock("oldwood_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
public static final Block TESCRAT = registerBlock("tescrat", properties -> new DirectedBlock(
            properties.strength(0.2f)
    ));
    public static final Block BLUE_BRENCH = registerBlock("blue_brench", properties -> new DirectedBlock(
            properties.strength(0.2f)
    ));
    public static final Block MRBLE = registerBlock("mrble", properties -> new MarbleBlock(
            properties.strength(0.2f)
    ));

    public static final Block WHITE_MARBLE  = registerBlock("white_marble", properties -> new Block(
            properties.strength(0.2f)
    ));


    public static final Block BROWN_MARBLE  = registerBlock("brown_marble", properties -> new Block(
            properties.strength(0.2f)
    ));

    public static final Block BLACK_MARBLE  = registerBlock("black_marble", properties -> new Block(
            properties.strength(0.2f)
    ));

    public static final Block DRY_ICE  = registerBlock("dry_ice", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block FRACTAL_DRY_ICE  = registerBlock("fractal_dry_ice", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block PURPLE_DIRT = registerBlock("purple_dirt", properties -> new Block(
            properties.strength(0.3f)
    ));
    public static final Block PURPLE_SOIL  = registerBlock("purple_soil", properties -> new Block(
            properties.strength(0.2f)
    ));

    public static final Block MOONY_DUST = registerBlock("moony_dust", properties -> new Block(
            properties.strength(0.3f)
    ));
    public static final Block MOONY_ROCK = registerBlock("moony_rock", properties -> new Block(
            properties.strength(0.3f)
    ));
    public static final Block SHRIMP = registerBlock("shrimp", properties -> new LarmpBlock(
            properties.strength(0.3f)
    ));

    //Wood
public static final Block MILLOW_LOG  = registerBlock("millow_log", properties -> new Block(
        properties.strength(0.2f)
));
    public static final Block MILLOW_WOOD  = registerBlock("millow_wood", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block MILLOW_STRIPPED_LOG = registerBlock("millow_stripped_log", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block MILLOW_PLANKS  = registerBlock("millow_planks", properties -> new Block(
            properties.strength(0.2f)
    ));
public static final Block MILLOW_STAIRS = registerBlock("millow_stairs", properties -> new StairBlock(
        myblocks.MILLOW_PLANKS.defaultBlockState(),
        properties.strength(0.2f)
));
    public static final Block MILLOW_SLAB = registerBlock("millow_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
public static final Block MILLOW_FENCE = registerBlock("millow_fence", properties -> new FenceBlock(
        properties.strength(0.2f)
));
    public static final Block MILLOW_FENCE_GATE = registerBlock("millow_fence_gate", properties -> new FenceGateBlock(
            WoodType.ACACIA, properties.strength(0.2f)
    ));
    public static final Block MILLOW_TRAPDOOR = registerBlock("millow_trapdoor", properties -> new TrapDoorBlock(
            BlockSetType.PALE_OAK, properties.strength(0.2f)
    ));
    public static final Block MILLOW_DOOR = registerBlock("millow_door", properties -> new DoorBlock(
            BlockSetType.PALE_OAK, properties.strength(0.2f)
    ));
    public static final Block MILLOW_LEAVES  = registerBlock("millow_leaves", properties -> new Block(
            properties.strength(0.2f).noOcclusion()
    ));
    public static final Block MILLOW_FALLING_LEAVES  = registerBlock("millow_falling_leaves", properties -> new Block(
            properties.strength(0.2f).noOcclusion()
    ));
    public static final Block MILLOW_BOOKSHELF  = registerBlock("millow_bookshelf", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block MILLOW_SHELF  = registerBlock("millow_shelf", properties -> new ShelfBlock(
            properties.strength(0.2f)
    ));
    public static final Block PURPLE_BUSHER = registerBlock("purple_busher", properties -> new StrangeFlower(
            properties
    ));
    public static final Block LIQUID_SMOOTH = registerBlock("liquid_smooth", properties -> new myliquid(
            properties.noOcclusion().lightLevel(state -> 4)
    ));
    public static final Block TOMATO_BLOCK = registerBlockwithoutitem("tomato_block", properties -> new tomatoBlock(
            properties
    ));

    //laurel wood, araucaria wood, wicked wood
//vanilla



    /*public static final Block GOLDEN_INGOT_BLOCK = registerBlock("golden_ingot_block", properties -> new SandBlock(
            properties.strength(0.2f)
    ));
    public static final Block IRON_INGOT_BLOCK = registerBlock("iron_ingot_block", properties -> new SandBlock(
            properties.strength(0.2f)
    ));
    public static final Block COPPER_INGOT_BLOCK = registerBlock("copper_ingot_block", properties -> new SandBlock(
            properties.strength(0.2f)
    ));*/
    //minerios
    public static final Block COBALT_BLOCK  = registerBlock("cobalt_block", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block COBALT_LANTERN  = registerBlock("cobalt_lantern", properties -> new LanternBlock(
            properties.strength(0.2f)
    ));
    public static final Block COBALT_CHAINS  = registerBlock("cobalt_chains", properties -> new ChainBlock(
            properties.strength(0.2f)
    ));
    public static final Block MAGNELITIUM_BLOCK  = registerBlock("magnelitium_block", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block SCRAPS_BLOCK  = registerBlock("scraps_block", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block SCRAPS_LANTERN  = registerBlock("scraps_lantern", properties -> new LanternBlock(
            properties.strength(0.2f)
    ));
    public static final Block SCRAPS_CHAINS  = registerBlock("scraps_chains", properties -> new ChainBlock(
            properties.strength(0.2f)
    ));

    public static final Block ROSE_QUARTZ  = registerBlock("rose_quartz", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block CHISELED_ROSE_QUARTZ_BLOCK  = registerBlock("chiseled_rose_quartz_block", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block ROSE_QUARTZ_BRICKS  = registerBlock("rose_quartz_bricks", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block ROSE_QUARTZ_PILLAR  = registerBlock("rose_quartz_pillar", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block ROSE_QUARTZ_STAIRS  = registerBlock("rose_quartz_stairs", properties -> new StairBlock(
            myblocks.ROSE_QUARTZ.defaultBlockState(),
            properties.strength(0.2f)
    ));
    public static final Block ROSE_QUARTZ_SLAB  = registerBlock("rose_quartz_slab", properties -> new SlabBlock(
            properties.strength(0.2f)
    ));
    public static final Block ROSE_QUARTZ_WALL = registerBlock("rose_quartz_wall", properties -> new WallBlock(
            properties.strength(0.2f)
    ));
//plants
//ores

public static final Block SPRUCE_BOOKSHELF =registerBlock("spruce_bookshelf", properties -> new Block(
        properties.strength(0.4f)
        ));
    public static final Block SPRUCE_PLATE=registerBlock("spruce_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block SPRUCE_LAMP=registerBlock("spruce_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f)
    ));
public static final Block BIRCH_BOOKSHELF =registerBlock("birch_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block BIRCH_PLATE=registerBlock("birch_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block BIRCH_LAMP=registerBlock("birch_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
public static final Block CHERRY_BOOKSHELF =registerBlock("cherry_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block CHERRY_PLATE=registerBlock("cherry_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block CHERRY_LAMP=registerBlock("cherry_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
public static final Block DARK_OAK_BOOKSHELF =registerBlock("dark_oak_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
public static final Block DARK_OAK_PLATE=registerBlock("dark_oak_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block DARK_OAK_LAMP=registerBlock("dark_oak_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block JUNGLE_BOOKSHELF =registerBlock("jungle_oak_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block JUNGLE_PLATE=registerBlock("jungle_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block JUNGLE_LAMP=registerBlock("jungle_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block PALE_OAK_BOOKSHELF =registerBlock("pale_oak_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block PALE_OAK_PLATE=registerBlock("pale_oak_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block PALE_OAK_LAMP=registerBlock("pale_oak_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block OAK_BOOKSHELF =registerBlock("oak_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block OAK_PLATE=registerBlock("oak_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block OAK_LAMP=registerBlock("oak_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block CRIMSON_BOOKSHELF =registerBlock("crimson_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block CRIMSON_PLATE=registerBlock("crimson_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block CRIMSON_LAMP=registerBlock("crimson_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block WARPED_BOOKSHELF =registerBlock("warped_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block WARPED_PLATE=registerBlock("warped_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block WARPED_LAMP=registerBlock("warped_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).noOcclusion().lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block MANGROVE_BOOKSHELF =registerBlock("mangrove_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block MANGROVE_PLATE=registerBlock("mangrove_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block MANGROVE_LAMP=registerBlock("mangrove_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block BAMBOO_BOOKSHELF =registerBlock("bamboo_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block BAMBOO_PLATE=registerBlock("bamboo_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block BAMBOO_LAMP=registerBlock("bamboo_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block ACACIA_BOOKSHELF =registerBlock("acacia_bookshelf", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block ACACIA_PLATE=registerBlock("acacia_plate", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block ACACIA_LAMP=registerBlock("acacia_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block DIAMOND_COBBLESTONE=registerBlock("diamond_cobblestone", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block SULFUR_SLIME_BLOCK  = registerBlock("sulfur_slime_block", properties -> new Block(
            properties.strength(0.2f)
    ));
    public static final Block GREEN_MOSS  = registerBlock("green_moss", properties -> new glowmossBlock(
            properties.strength(0.2f).lightLevel(state -> state.getValue(glowmossBlock.AGE)*2).randomTicks()
    ));
    public static final Block BLUE_MOSS  = registerBlock("blue_moss", properties -> new glowmossBlock(
            properties.strength(0.2f).lightLevel(state -> state.getValue(glowmossBlock.AGE)*2).randomTicks()
    ));
    public static final Block RED_MOSS  = registerBlock("red_moss", properties -> new glowmossBlock(
            properties.strength(0.2f).lightLevel(state -> state.getValue(glowmossBlock.AGE)*2).randomTicks()
    ));
    public static final Block FADESTONE_LAMP=registerBlock("fadestone_lamp", properties -> new LarmpBlock(
            properties.strength(0.4f).lightLevel(state -> state.getValue(LarmpBlock.LIT) ? 14:0)
    ));
    public static final Block SKY_BLOCK=registerBlock("sky_block", properties -> new Block(
            properties.strength(0.4f)
    ));
    public static final Block FADESTONE_CUBE=registerBlock("fadestone_cube", properties -> new DirectedBlock(
            properties.strength(0.4f).noOcclusion()
    ));






    private static Block registerBlockwithoutitem(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create( Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(Circle.MOD_ID, name)      )));

        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Circle.MOD_ID, name), toRegister);
    }
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
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

    public static void registerModBlocks(){

    }
}
