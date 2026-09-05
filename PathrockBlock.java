package circle.blue.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PathrockBlock extends VegetationBlock {
    protected VoxelShape SHAPE = Block.column((double)16.0F, (double)0.0F, (double)1.0F);


    protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context){
        return SHAPE;
    }
    public PathrockBlock(Properties properties) {
        super(properties);
    }
    @Override
    protected MapCodec<? extends VegetationBlock> codec() {
        return null;
    }

    protected boolean mayPlaceOn(final BlockState state, final BlockGetter level, final BlockPos pos){
        BlockState blockBelow = level.getBlockState(pos);
return blockBelow.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER)||blockBelow.is(Blocks.DIRT_PATH);
    }


}
