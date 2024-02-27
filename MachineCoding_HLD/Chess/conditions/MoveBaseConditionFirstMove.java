package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Piece;

public class MoveBaseConditionFirstMove implements MoveBaseCondition{
    @Override
    public boolean isBaseConditionFulfilled(Piece piece) {
        return piece.getNumMoves() == 0;
    }
}
