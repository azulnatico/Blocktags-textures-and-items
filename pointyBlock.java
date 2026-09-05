package circle.blue.blocks;

import circle.blue.MyTags;
import circle.blue.PLACED;
import circle.blue.THICK;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class pointyBlock extends Block {

    public static final VoxelShape SHAPE = box(2,4,2, 14,12, 14 );

    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    public pointyBlock(Properties properties) {
        super(properties);
        registerDefaultState((BlockState)(BlockState)(BlockState)this.stateDefinition.any().setValue(LIT, true).setValue(PLACE, PLACED.ABOVE).setValue(THICKNESS, THICK.BASE));
    }
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public static final EnumProperty<PLACED> PLACE = EnumProperty.create("place", PLACED.class);
    public static final EnumProperty<THICK> THICKNESS  = EnumProperty.create("thickness", THICK.class);


    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos clicked = context.getClickedPos();
        Level level = context.getLevel();

        final BlockState thisblock = this.defaultBlockState();
        BlockPos north = clicked.north();
BlockState xnorth = level.getBlockState(north);
        BlockPos south = clicked.south();
BlockState xsouth = level.getBlockState(south);
        BlockPos east = clicked.east();
BlockState xeast = level.getBlockState(east);
        BlockPos west = clicked.west();
BlockState xwest = level.getBlockState(west);
        BlockPos above = clicked.above();
BlockState xabove = level.getBlockState(above);
        BlockPos below = clicked.below();
BlockState xbelow = level.getBlockState(below);
        Direction whichface = context.getClickedFace();
switch(whichface){
    case SOUTH:
        thisblock.setValue(PLACE, PLACED.SOUTH);
        return uptadeSOUTH(thisblock, level, clicked);
    case NORTH:
        thisblock.setValue(PLACE, PLACED.NORTH);
        return uptadeNORTH(thisblock, level, clicked);
    case EAST:
        thisblock.setValue(PLACE, PLACED.EAST);
        return uptadeEAST(thisblock, level, clicked);
    case WEST:
        thisblock.setValue(PLACE, PLACED.WEST);
        return uptadeWEST(thisblock, level, clicked);
    case UP:
        thisblock.setValue(PLACE, PLACED.ABOVE);
        return uptadeUP(thisblock, level, clicked);
    case DOWN:
        thisblock.setValue(PLACE, PLACED.BELOW);
        return uptadeDOWN(thisblock, level, clicked);}


        if(xnorth.is(MyTags.Blocks.FADESTONES)){return (BlockState)(BlockState)thisblock.setValue(PLACE, PLACED.SOUTH).setValue(THICKNESS, THICK.FRUSTUM);}
return (BlockState)(BlockState)thisblock.setValue(PLACE, PLACED.ABOVE).setValue(THICKNESS, THICK.MEDIUM);
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

            if(!neighbourState.is(myblocks.POINTED_FADESTONE)){return super.updateShape(state, level,ticks, pos, directionToNeighbour, neighbourPos, neighbourState, random);}
        switch(state.getValue(PLACE)){
            case NORTH:

                return this.uptadeNORTH(state, level, pos);
            case SOUTH:
                return this.uptadeSOUTH(state, level, pos);
            case WEST:
                return this.uptadeWEST(state, level, pos );
            case EAST:
                return  this.uptadeEAST(state, level, pos );
            case ABOVE:

                return  this.uptadeUP(state, level,  pos);
            case BELOW:
                return  this.uptadeDOWN(state, level,  pos);

        }
return super.updateShape(state, level,ticks, pos, directionToNeighbour, neighbourPos, neighbourState, random);
        }




    BlockState uptadeUP(BlockState thisblock, LevelReader level, BlockPos pos){
       int count =1;
int blockup =0;
        int blockdown =0;
BlockState newblock = level.getBlockState(pos.below());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
BlockPos npos = pos.below(count);
newblock = level.getBlockState(npos);
count++;
blockdown++;
        }
        count =1;
        newblock = level.getBlockState(pos.above());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.above(count);
            newblock = level.getBlockState(npos);
            count++;
            blockup++;
        }
if(blockup==0){

    thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
    return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.TIP);}
        if(blockup==2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.MEDIUM);}
        if(blockdown==0&&blockup>2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return(BlockState)(BlockState) thisblock.setValue(THICKNESS, THICK.BASE);}

        else{ thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.FRUSTUM).setValue(PLACE, PLACED.ABOVE);}
    }



    BlockState uptadeDOWN(BlockState thisblock, LevelReader level, BlockPos pos){
        int count =1;
        int blockup =0;
        int blockdown =0;
        BlockState newblock = level.getBlockState(pos.above());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.above(count);
            newblock = level.getBlockState(npos);
            count++;
            blockdown++;
        }
        count =1;
        newblock = level.getBlockState(pos.below());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.below(count);
            newblock = level.getBlockState(npos);
            count++;
            blockup++;
        }
        if(blockup==0){

            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.TIP).setValue(PLACE, PLACED.BELOW);}
        if(blockup==2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.MEDIUM).setValue(PLACE, PLACED.BELOW);}
        if(blockdown==0&&blockup>2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return(BlockState)(BlockState) thisblock.setValue(THICKNESS, THICK.BASE).setValue(PLACE, PLACED.BELOW);}

        else{ thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.FRUSTUM).setValue(PLACE, PLACED.BELOW);}

    }
    BlockState uptadeNORTH(BlockState thisblock, LevelReader level, BlockPos pos){
        int count =1;
        int blockup =0;
        int blockdown =0;
        BlockState newblock = level.getBlockState(pos.south());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.south(count);
            newblock = level.getBlockState(npos);
            count++;
            blockdown++;
        }
        count =1;
        newblock = level.getBlockState(pos.north());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.north(count);
            newblock = level.getBlockState(npos);
            count++;
            blockup++;
        }
        if(blockup==0){

            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.TIP).setValue(PLACE, PLACED.NORTH);}
        if(blockup==1||blockup==2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.MEDIUM).setValue(PLACE, PLACED.NORTH);}
        if(blockdown==0&&blockup>2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return(BlockState)(BlockState) thisblock.setValue(THICKNESS, THICK.BASE).setValue(PLACE, PLACED.NORTH);}

        else{ thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.FRUSTUM).setValue(PLACE, PLACED.NORTH);}

    }
    BlockState uptadeSOUTH(BlockState thisblock, LevelReader level, BlockPos pos){
        int count =1;
        int blockup =0;
        int blockdown =0;
        BlockState newblock = level.getBlockState(pos.north());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.north(count);
            newblock = level.getBlockState(npos);
            count++;
            blockdown++;
        }
        count =1;
        newblock = level.getBlockState(pos.south());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.south(count);
            newblock = level.getBlockState(npos);
            count++;
            blockup++;
        }
        if(blockup==0){

            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.TIP).setValue(PLACE, PLACED.SOUTH);}
        if(blockup==2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.MEDIUM).setValue(PLACE, PLACED.SOUTH);}
        if(blockdown==0&&blockup>2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return(BlockState)(BlockState) thisblock.setValue(THICKNESS, THICK.BASE).setValue(PLACE, PLACED.SOUTH);}

        else{ thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.FRUSTUM).setValue(PLACE, PLACED.SOUTH);}
 }
    BlockState uptadeEAST(BlockState thisblock, LevelReader level, BlockPos pos){
        int count =1;
        int blockup =0;
        int blockdown =0;
        BlockState newblock = level.getBlockState(pos.west());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.west(count);
            newblock = level.getBlockState(npos);
            count++;
            blockdown++;
        }
        count =1;
        newblock = level.getBlockState(pos.east());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.east(count);
            newblock = level.getBlockState(npos);
            count++;
            blockup++;
        }
        if(blockup==0){

            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.TIP).setValue(PLACE, PLACED.EAST);}
        if(blockup==2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.MEDIUM).setValue(PLACE, PLACED.EAST);}
        if(blockdown==0&&blockup>2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return(BlockState)(BlockState) thisblock.setValue(THICKNESS, THICK.BASE).setValue(PLACE, PLACED.EAST);}

        else{ thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.FRUSTUM).setValue(PLACE, PLACED.EAST);}

    }
    BlockState uptadeWEST(BlockState thisblock, LevelReader level, BlockPos pos){
        int count =1;
        int blockup =0;
        int blockdown =0;
        BlockState newblock = level.getBlockState(pos.east());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.east(count);
            newblock = level.getBlockState(npos);
            count++;
            blockdown++;
        }
        count =1;
        newblock = level.getBlockState(pos.west());
        while(newblock.is(myblocks.POINTED_FADESTONE)){
            BlockPos npos = pos.west(count);
            newblock = level.getBlockState(npos);
            count++;
            blockup++;
        }
        if(blockup==0){

            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.TIP).setValue(PLACE, PLACED.WEST);}
        if(blockup==2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.MEDIUM).setValue(PLACE, PLACED.WEST);}
        if(blockdown==0&&blockup>2){
            thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);

            return(BlockState)(BlockState) thisblock.setValue(THICKNESS, THICK.BASE).setValue(PLACE, PLACED.WEST);}

        else{ thisblock.updateNeighbourShapes((LevelAccessor) level, pos, 3);
            return (BlockState)(BlockState)thisblock.setValue(THICKNESS, THICK.FRUSTUM).setValue(PLACE, PLACED.WEST);}


    }









    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(PLACE);
        builder.add(THICKNESS);
        builder.add(LIT);
    }



}
