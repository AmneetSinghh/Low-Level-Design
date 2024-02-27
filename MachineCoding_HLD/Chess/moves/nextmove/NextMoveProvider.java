package MachineCoding_HLD.Chess.moves.nextmove;

import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;

public interface NextMoveProvider {
    Cell nextCell(Cell cell, Board board, int times);
}
