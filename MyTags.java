package circle.blue;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MyTags {
    public static class Blocks {


        public static final TagKey<Block> INCORRECT_FOR_COBALT_TOOLS = createTag("incorrect_for_cobalt_tools");
        public static final TagKey<Block> INCORRECT_FOR_OPAL_TOOLS = createTag("incorrect_for_opal_tools");
        public static final TagKey<Block> LAMPS= createTag("lamps");
        public static final TagKey<Block> FADESTONES= createTag("fadestones");
        public static final TagKey<Block> POINTED_FADESTONES= createTag("pointed_fadestones");
        public static final TagKey<Block> MYSTAIRS= createTag("mystairs");
        public static final TagKey<Block> MYSLABS= createTag("myslabs");



        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Circle.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> COBALT_REPAIR = createitemTag("cobalt_repair");
        public static final TagKey<Item> OPAL_REPAIR = createitemTag("opal_repair");

        private static TagKey<Item> createitemTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Circle.MOD_ID, name));
        }
    }
public static void registertags(){}
}
