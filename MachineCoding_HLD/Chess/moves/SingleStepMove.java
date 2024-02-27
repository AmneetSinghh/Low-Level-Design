package MachineCoding_HLD.Chess.moves;


import MachineCoding_HLD.Chess.moves.nextmove.NextMoveProvider;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SingleStepMove {
    private int singleStep;
    private NextMoveProvider nextMoveProvider;
}
