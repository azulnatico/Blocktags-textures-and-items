package circle.blue.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.LevelReader;

public class StrangeFlower extends VegetationBlock{
    public static final MapCodec<StrangeFlower> CODEC = simpleCodec(StrangeFlower::new);
public static final VoxelShape SHAPE = box(0, 0, 0, 16, 16, 16);




    protected StrangeFlower(Properties properties) {
        super(properties);
    }

    public MapCodec<StrangeFlower> codec() {
        return CODEC;
    }


protected VoxelShape GetShape (BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
                  return SHAPE;
                      }

 public boolean isValidBonemealTarget(final LevelReader level, final BlockPos pos, final BlockState state) {
        return true;
    }

    public boolean isBonemealSuccess(final Level level, final RandomSource random, final BlockPos pos, final BlockState state) {
        return true;
    }

    public void performBonemeal(final ServerLevel level, final RandomSource random, final BlockPos pos, final BlockState state) {
        popResource(level, pos, new ItemStack(this));
    }


    protected boolean mayPlaceOn(final BlockState state, final BlockGetter level, final BlockPos pos){
           BlockState blockBelow = level.getBlockState(pos);
   return blockBelow.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER)||blockBelow.is(BlockTags.OAK_LOGS);
       }

}
