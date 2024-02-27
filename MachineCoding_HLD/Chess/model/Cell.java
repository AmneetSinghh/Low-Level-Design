package MachineCoding_HLD.Chess.model;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cell {
    private int x;
    private int y;
    private Piece currentPiece;

    public boolean isFree(){
        return (currentPiece == null);
    }
}
