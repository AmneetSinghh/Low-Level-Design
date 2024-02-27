package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;

/**
 * Condition interface to tell whether a piece can further move from a cell.
 */
public interface PieceMoveFurtherCondition {

    boolean canPieceMoveFurtherFromCell(Piece piece, Cell cell, Board board);
}
