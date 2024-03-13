package MachineCoding_HLD.Chess.moves;

import MachineCoding_HLD.Chess.conditions.MoveBaseCondition;
import MachineCoding_HLD.Chess.conditions.PieceCellOccupyBlocker;
import MachineCoding_HLD.Chess.conditions.PieceMoveFurtherCondition;
import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;
import MachineCoding_HLD.Chess.model.player.Player;
import MachineCoding_HLD.Chess.moves.nextmove.DownMoveProvider;
import MachineCoding_HLD.Chess.moves.nextmove.UpMoveProvider;

import java.util.ArrayList;
import java.util.List;

public class PossibleMovesProviderVertical extends PossibleMovesProvider{
    public PossibleMovesProviderVertical(int maxSteps, int singleMoveStep, List<MoveBaseCondition> moveBaseConditions, List<PieceMoveFurtherCondition> moveFurtherConditions, List<PieceCellOccupyBlocker> pieceCellOccupyBlockers) {
        super(maxSteps, moveBaseConditions, moveFurtherConditions, pieceCellOccupyBlockers);
    }

    @Override
    protected List<Cell> possibleMovesAsPerCurrentType(Piece piece, Board board, List<PieceCellOccupyBlocker> additionalBlockers, Player player) {
        List<Cell> result = new ArrayList<>();
        result.addAll(findAllNextMovies(piece,List.of(new SingleStepMove(1, new UpMoveProvider())) , board, additionalBlockers, player));
        result.addAll(findAllNextMovies(piece,List.of(new SingleStepMove(1, new DownMoveProvider())) , board, additionalBlockers, player));
        return result;
    }
}
