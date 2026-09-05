package circle.blue.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class glowmossBlock extends VegetationBlock {

    public glowmossBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends VegetationBlock> codec() {
        return null;
    }

    public static final int MAX_AGE = 7;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, MAX_AGE);
    public BlockState getStateForAge(final int age) {
        return (BlockState)this.defaultBlockState().setValue(this.getAgeProperty(), age);
    }
    public static final VoxelShape SHAPE = box(0, 0, 0, 16, 16, 16);
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }





    public int getMaxAge() {
        return 5;
    }
public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return SHAPE;
}
    protected boolean isRandomlyTicking(final BlockState state) {return true;}
    protected static float getGrowthSpeed(final Block type, final BlockGetter level, final BlockPos pos) {
        return 1.0f;
    }
    protected static boolean hasSufficientLight(final LevelReader level, final BlockPos pos) {
        return true;
    }
        @Override
    protected void randomTick(final BlockState state,
                              final ServerLevel level,
                              final BlockPos pos,
                              final RandomSource random){


    int age = (Integer)state.getValue(this.getAgeProperty());



    if (age < this.getMaxAge()) {
        float growthSpeed = getGrowthSpeed(this, level, pos);
        if (random.nextInt((int)(25.0F / growthSpeed) + 1) == 0) {
            level.setBlock(pos, this.getStateForAge(age + 1), 2);
        }
    } else{
        float growthSpeed = getGrowthSpeed(this, level, pos);
        if (random.nextInt((int)(25.0F / growthSpeed) + 1) == 0) {
            level.setBlock(pos, this.getStateForAge(0), 2);
        }

    }

    }
    protected boolean mayPlaceOn(final BlockState state, final BlockGetter level, final BlockPos pos) {
        return true;
    }






    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {

        builder.add(AGE);
    }

}
