package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;
import MachineCoding_HLD.Chess.model.player.Player;

public class PieceCellOccupyBlockerKingCheck implements PieceCellOccupyBlocker{
    @Override
    public boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player) {
        // later.
        return false;
    }
}
