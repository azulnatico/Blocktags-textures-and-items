package circle.blue.blocks;


import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class MarbleBlock extends Block {
        public MarbleBlock(Properties properties) {
            super(properties);
            registerDefaultState(this.defaultBlockState()
                    .setValue(RIGHTX, true).setValue(RIGHTY, false).setValue(RIGHTZ, false)
                    .setValue(RIGHTYX, false).setValue(RIGHTZY, false).setValue(RIGHTZX, false)
                    .setValue(RIGHTYX, false).setValue(RIGHT, false).setValue(RIGHTXYZ, false));
        }
    public static final VoxelShape SHAPE = Block.column((double)16.0F, (double)0.0F, (double)16.0F);
    public static final BooleanProperty RIGHTX = BooleanProperty.create("rightx");
    public static final BooleanProperty RIGHTY = BooleanProperty.create("righty");
    public static final BooleanProperty RIGHTZ = BooleanProperty.create("rightz");
    public static final BooleanProperty RIGHTZX = BooleanProperty.create("rightzx");
    public static final BooleanProperty RIGHTZY = BooleanProperty.create("rightzy");
    public static final BooleanProperty RIGHTYX = BooleanProperty.create("rightyx");
    public static final BooleanProperty RIGHTXYZ = BooleanProperty.create("rightxyz");
    public static final BooleanProperty RIGHT = BooleanProperty.create("right");

        public BlockState getStateForPlacement (final BlockPlaceContext context){
            LevelReader level = context.getLevel();
            BlockPos pos = context.getClickedPos();
            boolean X = (pos.getX()%2)==0;
            boolean Y = (pos.getY()%2)==0;
            boolean Z = (pos.getZ()%2)==0;
            BlockState state = this.defaultBlockState();
            return state.setValue(RIGHTX, (X&&!Y&&!Z)).setValue(RIGHTY,(!X&&Y&&!Z) ).setValue(RIGHTZ,(!X&&!Y&&Z) ).setValue(RIGHTZX, (X&&!Y&&Z))
                    .setValue(RIGHTZY, (!X&&Y&&Z)).setValue(RIGHTYX,(X&&Y&&!Z) ).setValue(RIGHTXYZ, (X&&Y&&Z)).setValue(RIGHT,(!X&&!Y&&!Z) );
        };
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }




    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(RIGHTX);
        builder.add(RIGHTY);
        builder.add(RIGHTZ);
        builder.add(RIGHTZX);
        builder.add(RIGHTYX);
        builder.add(RIGHTZY);
        builder.add(RIGHTXYZ);
        builder.add(RIGHT);
    }
    }
