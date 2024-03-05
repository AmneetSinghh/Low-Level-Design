package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;
import MachineCoding_HLD.Chess.model.player.Player;

/**
 * This tells that a cell cannot occupy a cell if that cell already has any piece from the same player.
 */

public class PieceCellOccupyBlockerSelfPiece implements PieceCellOccupyBlocker {

    @Override
    public boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player) {
        if (cell.isFree()) {
            return false;
        }
        // same player.
        return cell.getCurrentPiece().getColor() == piece.getColor();
    }
}


