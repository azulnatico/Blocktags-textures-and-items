package circle.blue.blocks;

import circle.blue.SIZE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

public class myliquid extends Block {
    public myliquid(Properties properties) {
        super(properties);
        registerDefaultState(this.stateDefinition.any().setValue(SIZER, SIZE.BIG)
                .setValue(WEST, false)
                .setValue(EAST, false)
                .setValue(NORTH, false)
                .setValue(SOUTH, false)
                .setValue(ABOVE, false)
                .setValue(BELOW, false));

    }
    public static final EnumProperty<SIZE> SIZER= EnumProperty.create("sizer", SIZE.class);
  public static final  BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty ABOVE = BooleanProperty.create("above");
    public static final  BooleanProperty BELOW = BooleanProperty.create("below");
    public static final VoxelShape bigshape = box(0, 0, 0, 16, 16,16 );
    public static final VoxelShape mediumshape = box(2, 2, 2, 14, 14,14 );
    public static final VoxelShape littleshape = box(4, 4, 4, 12, 12,12 );
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch(state.getValue(SIZER)){
            case BIG:
                return bigshape;
            case MEDIUM:
                return mediumshape;
            case LITTLE:
                return littleshape;
        }
        return bigshape;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = this.defaultBlockState();

        return uptadeshape(state, pos, level);


    }
    protected BlockState updateShape(final BlockState state,
                                     final LevelReader level,
                                     final ScheduledTickAccess ticks,
                                     final BlockPos pos,
                                     final Direction directionToNeighbour,
                                     final BlockPos neighbourPos,
                                     final BlockState neighbourState,
                                     final RandomSource random)

    {

       return this.uptadeshape(state, pos, level) ;

    }












    protected BlockState uptadeshape(BlockState state, BlockPos pos, LevelReader level){
        BlockPos below = pos.below();
        BlockPos above = pos.above();
        BlockPos south = pos.south();
        BlockPos north = pos.north();
        BlockPos west = pos.west();
        BlockPos east = pos.east();

        return state.setValue(BELOW, (level.getBlockState(below)).is(myblocks.LIQUID_SMOOTH))
       .setValue(ABOVE, (level.getBlockState(above)).is(myblocks.LIQUID_SMOOTH))
        .setValue(NORTH, (level.getBlockState(north)).is(myblocks.LIQUID_SMOOTH))
        .setValue(SOUTH, (level.getBlockState(south)).is(myblocks.LIQUID_SMOOTH))
        .setValue(WEST, (level.getBlockState(west)).is(myblocks.LIQUID_SMOOTH))
        .setValue(EAST, (level.getBlockState(east)).is(myblocks.LIQUID_SMOOTH));

    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SIZER);

        builder.add(EAST);
        builder.add(NORTH);
        builder.add(SOUTH);
        builder.add(WEST);
        builder.add(ABOVE);
        builder.add(BELOW);

    }
}
