package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Piece;

public interface MoveBaseCondition {
    boolean isBaseConditionFulfilled(Piece piece);// pawn can move depends on number of moves.
}