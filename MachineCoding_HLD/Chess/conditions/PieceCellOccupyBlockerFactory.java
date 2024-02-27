package MachineCoding_HLD.Chess.conditions;

import java.util.List;

/**
 * Factory class to give cell occupy blockers for different scenarios.
 */
public class PieceCellOccupyBlockerFactory {

    public static PieceCellOccupyBlocker defaultBaseBlocker() {
        return new PieceCellOccupyBlockerSelfPiece();
    }

    public static List<PieceCellOccupyBlocker> defaultAdditionalBlockers() {
        return List.of(new PieceCellOccupyBlockerKingCheck());// king check blocker.... check mate.
    }

    public static List<PieceCellOccupyBlocker> kingCheckEvaluationBlockers() {
        return List.of();
    }
}

