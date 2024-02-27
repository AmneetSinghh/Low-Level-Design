package MachineCoding_HLD.Chess.conditions;

import MachineCoding_HLD.Chess.model.Piece;

/**
 * Helper implementation to use when there is no associated base condition with a move.
 */
public class NoMoveBaseCondition implements MoveBaseCondition {
    @Override
    public boolean isBaseConditionFulfilled(Piece piece) {
        return true;
    }
}
/*
single move : 2 steps
 */