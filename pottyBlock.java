package circle.blue.blocks;

import circle.blue.FLOWERINPOT;
import circle.blue.THICK;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class pottyBlock extends Block {
public static VoxelShape SHAPE = box(0, 0, 0, 14, 6, 14);

public static final int MAX_FLOWER =4;
    public static final EnumProperty<FLOWERINPOT> FLOWER  = EnumProperty.create("flower", FLOWERINPOT.class);
public static final IntegerProperty HOWMANY = IntegerProperty.create("howmany", 0, MAX_FLOWER);


    public pottyBlock(Properties properties) {
        super(properties);


    }
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    protected boolean isRandomlyTicking(final BlockState state) {return true;}

    protected void randomTick(final BlockState state,
                              final ServerLevel level,
                              final BlockPos pos,
                              final RandomSource random){}












    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {

        builder.add(FLOWER);
        builder.add(HOWMANY);
    }
}
