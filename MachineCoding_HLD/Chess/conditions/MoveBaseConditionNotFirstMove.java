package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Piece;

public class MoveBaseConditionNotFirstMove implements MoveBaseCondition{
    @Override
    public boolean isBaseConditionFulfilled(Piece piece) {
       return piece.getNumMoves() > 0;
    }
}
