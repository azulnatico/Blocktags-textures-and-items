package circle.blue;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
/*
public class TestBlock extends Block {
    public TestBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(YA, false).setValue(YO, true));
    }

    public static final BooleanProperty YA= BooleanProperty.create("ya");
    public static final BooleanProperty YO= BooleanProperty.create("yo");
    public BlockState getStateForPlacement (final BlockPlaceContext context){
        LevelReader level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = this.defaultBlockState();
        return state.setValue(YA, false).setValue(YO, true);

    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(YA);
        builder.add(YO);
    }

}
*/