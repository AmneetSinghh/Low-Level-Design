package MachineCoding_HLD.Chess.moves.nextmove;

import MachineCoding_HLD.Chess.model.Board;
import MachineCoding_HLD.Chess.model.Cell;

public class UpMoveProvider implements NextMoveProvider{
    @Override
    public Cell nextCell(Cell cell, Board board, int times) {
        Cell start = cell;
        while(times>0){
            start =  board.getUpCell(start);
            --times;
        }
        return start;
    }
}

