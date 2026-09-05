package circle.blue.blocks;

import circle.blue.PLACED;
import circle.blue.THICK;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LarmpBlock extends Block {

    public static final VoxelShape SHAPE = box(2,4,2, 14,12, 14 );

    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    public LarmpBlock(Properties properties) {
        super(properties);
        registerDefaultState((BlockState)(BlockState)(BlockState)(BlockState)this.stateDefinition.any().setValue(LIT, true).setValue(FORM, false).setValue(PLACE, PLACED.NORTH).setValue(THICKNESS, THICK.BASE));
    }
    public static final BooleanProperty LIT = BooleanProperty.create("lit");
    public static final BooleanProperty FORM = BooleanProperty.create("form");
public static final EnumProperty<PLACED> PLACE = EnumProperty.create("place", PLACED.class);
    public static final EnumProperty<THICK> THICKNESS  = EnumProperty.create("thickness", THICK.class);
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        level.setBlockAndUpdate(pos, state.cycle(LIT));
        return InteractionResult.SUCCESS;
    }





    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(LIT);
        builder.add(FORM);
        builder.add(PLACE);
        builder.add(THICKNESS);

    }
}