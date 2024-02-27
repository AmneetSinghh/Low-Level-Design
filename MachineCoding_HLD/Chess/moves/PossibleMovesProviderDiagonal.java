package MachineCoding_HLD.Chess.moves;

import MachineCoding_HLD.Chess.conditions.MoveBaseCondition;
import MachineCoding_HLD.Chess.conditions.PieceCellOccupyBlocker;
import MachineCoding_HLD.Chess.conditions.PieceMoveFurtherCondition;
import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;
import MachineCoding_HLD.Chess.model.player.Player;

import java.util.List;

public class PossibleMovesProviderDiagonal extends PossibleMovesProvider{
    public PossibleMovesProviderDiagonal(int maxSteps, int singleMoveStep, List<MoveBaseCondition> moveBaseConditions, List<PieceMoveFurtherCondition> moveFurtherConditions, List<PieceCellOccupyBlocker> pieceCellOccupyBlockers) {
        super(maxSteps, moveBaseConditions, moveFurtherConditions, pieceCellOccupyBlockers);
    }

    @Override
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        return null;
    }
}
