package MachineCoding_HLD.Chess.moves;

import MachineCoding_HLD.Chess.conditions.MoveBaseCondition;
import MachineCoding_HLD.Chess.conditions.PieceCellOccupyBlocker;
import MachineCoding_HLD.Chess.conditions.PieceMoveFurtherCondition;
import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;
import MachineCoding_HLD.Chess.model.player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Data
@AllArgsConstructor
public abstract class PossibleMovesProvider {
    private int maxSteps;
    private List<MoveBaseCondition> moveBaseConditions;
    private List<PieceMoveFurtherCondition> moveFurtherConditions;
    private List<PieceCellOccupyBlocker> pieceCellOccupyBlockers;// king checks are additional blockers.


    public List<Cell> possibleMovies(Piece piece, List<PieceCellOccupyBlocker> pieceCellOccupyBlockers, Player player, Board  board){
        boolean baseConditionSatisfied = true;
        for (MoveBaseCondition base : moveBaseConditions) {
            if (base.isBaseConditionFulfilled(piece));
            else baseConditionSatisfied= false;
        }
        if(baseConditionSatisfied){
            return possibleMovesAsPerCurrentType(piece,board,pieceCellOccupyBlockers,player);
        }
        return null;
    }

    protected abstract List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player);


    protected List<Cell> findAllNextMovies(Piece piece, List<SingleStepMove> singleStepMoves, Board board, List<PieceCellOccupyBlocker> cellOccupyBlockers, Player player){
        List<Cell> result = new ArrayList<>();
        Cell nextCell = getNextMove(piece.getCurrentCell(), board, player, singleStepMoves);
        int nextSteps = 1;
        while(nextCell!=null && nextSteps<=maxSteps){
            if (checkIfCellCanBeOccupied(piece, nextCell, board, cellOccupyBlockers, player)) {
                // check moveFurther conditions as well.
                result.add(nextCell);
            }
            nextCell = getNextMove(nextCell,board,player,singleStepMoves); // next steps.
            nextSteps++;
        }
        return result;
    }


    private Cell getNextMove(Cell nextCell, Board board, Player player, List<SingleStepMove> singleStepMoves ){
        Cell currentCell = nextCell;
        for(SingleStepMove singleStepMove : singleStepMoves){// 2 steps right, 1 step left.
            currentCell = singleStepMove.getNextMoveProvider().nextCell(currentCell,board,singleStepMove.getSingleStep());
        }
        return currentCell;
    }


    /**
     * Helper method which checks if a given cell can be occupied by the piece or not. It makes use of list of
     * {@link PieceCellOccupyBlocker}s passed to it while checking. Also each move has one base blocker which it should
     * also check.
     */

    // These are conditions must be satisfy for occupying that cell.
    private boolean checkIfCellCanBeOccupied(Piece piece, Cell cell, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        for (PieceCellOccupyBlocker moveBaseCondition : pieceCellOccupyBlockers) {
            if (moveBaseCondition.isCellNonOccupiableForPiece(cell, piece, board, player)) {
                return false;
            }
        }
        // king checks.
        for (PieceCellOccupyBlocker cellOccupyBlocker : additionalBlockers) {
            if (cellOccupyBlocker.isCellNonOccupiableForPiece(cell, piece, board, player)) {
                return false;
            }
        }
        return true;
    }
}
