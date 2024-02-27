package MachineCoding_HLD.Chess.model.player;


import MachineCoding_HLD.Chess.model.Cell;
import MachineCoding_HLD.Chess.model.Piece;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class PlayerMove {
    private Cell toCell;
    private Piece piece;
}
