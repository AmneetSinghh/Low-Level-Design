package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;

/**
 * Default condition for moving further. By default, a piece is allowed to move from a cell only if the cell was free
 * when it came there.
 */


public class PieceMoveFurtherConditionDefault implements PieceMoveFurtherCondition {

    @Override
    public boolean canPieceMoveFurtherFromCell(Piece piece, Cell cell, Board board) {
        return cell.isFree();
    }
}
