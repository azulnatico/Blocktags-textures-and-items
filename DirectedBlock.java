package circle.blue;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.SupportType;
import org.jspecify.annotations.Nullable;

public class DirectedBlock extends Block{

        public static final BooleanProperty EAST = BooleanProperty.create("east");
        public static final BooleanProperty WEST = BooleanProperty.create("west");
        public static final BooleanProperty NORTH = BooleanProperty.create("north");
        public static final BooleanProperty SOUTH = BooleanProperty.create("south");
        public static final BooleanProperty BELOW = BooleanProperty.create("below");
        public static final BooleanProperty ABOVE = BooleanProperty.create("above");
        public static final BooleanProperty NORMAL = BooleanProperty.create("normal");
private static final VoxelShape SHAPE = Block.column((double)16.0F, (double)0.0F, (double)16.0F);
 protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    public DirectedBlock(Properties properties) {
            super(properties);
            registerDefaultState(this.defaultBlockState()
            .setValue(EAST, false)
            .setValue(WEST, false)
            .setValue(NORTH, false)
            .setValue(SOUTH, false)
            .setValue(ABOVE, false)
            .setValue(BELOW, false)
            .setValue(NORMAL, true));
        }



    public BlockState getStateForPlacement(final BlockPlaceContext context) {
            LevelReader level = context.getLevel();
            BlockPos pos = context.getClickedPos();
           BlockPos northPos = pos.north();
           BlockPos eastPos = pos.east();
           BlockPos southPos = pos.south();
           BlockPos westPos = pos.west();
           BlockPos topPos = pos.above();
           BlockPos belowPos = pos.below();
                   BlockState northState = level.getBlockState(northPos);
                   BlockState eastState = level.getBlockState(eastPos);
                   BlockState southState = level.getBlockState(southPos);
                   BlockState westState = level.getBlockState(westPos);
                   BlockState topState = level.getBlockState(topPos);
                   BlockState bottomState = level.getBlockState(belowPos);
           boolean north = northState.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER);
           boolean east = eastState.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER);
           boolean south = southState.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER);
           boolean west = northState.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER);
           boolean top = topState.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER);
           boolean bottom = bottomState.isFaceSturdy(level, pos, Direction.UP, SupportType.CENTER);
           BlockState state = this.defaultBlockState();
           return this.uptadeShape(level,state, top, bottom, north, east, south, west);

           }
   public BlockState uptadeShape(final LevelReader level, BlockState state, final boolean top,final boolean bottom,final boolean north, final boolean east, final boolean south, final boolean west){
   return state.setValue(NORTH, north)
  .setValue(SOUTH, south)
  .setValue(WEST, west)
  .setValue(EAST, east)
  .setValue(ABOVE, top)
  .setValue(BELOW, bottom)
  .setValue(NORMAL, true);

}

    @Override
 protected BlockState updateShape(final BlockState state,
                                  final LevelReader level,
                                  final ScheduledTickAccess ticks,
                                  final BlockPos pos, final Direction directionToNeighbour,
                                  final BlockPos neighbourPos, final BlockState neighbourState,
                                  final RandomSource random){
        boolean yo = neighbourState.isFaceSturdy(level, pos, directionToNeighbour, SupportType.CENTER);

        switch (directionToNeighbour){
            case SOUTH -> {
                return state.setValue(SOUTH, yo);
            }

            case NORTH -> {
                return state.setValue(NORTH, yo);
            }
            case WEST -> {
                return state.setValue(WEST, yo);
            }
            case EAST -> {
                return state.setValue(EAST, yo);
            }
            case DOWN -> {
                return state.setValue(BELOW, yo);
            }
            case UP -> {
                return state.setValue(ABOVE, yo);
            }
            default ->{
                return state.setValue(NORMAL, yo);
            }
            }
 }









    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(EAST);
         builder.add(NORTH);
          builder.add(SOUTH);
           builder.add(WEST);
            builder.add(BELOW);
             builder.add(ABOVE);
              builder.add(NORMAL);
    }
}
