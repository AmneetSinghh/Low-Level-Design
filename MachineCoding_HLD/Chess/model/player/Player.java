package MachineCoding_HLD.Chess.model.player;

import MachineCoding_HLD.Chess.enums.PieceType;
import MachineCoding_HLD.Chess.enums.PlayerType;
import MachineCoding_HLD.Chess.exceptions.PieceNotFoundException;
import MachineCoding_HLD.Chess.model.Piece;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
public abstract class Player {
    private PlayerType playerType;
    public List<Piece> pieces;

    public Piece getPiece(PieceType pieceType) {
        for (Piece piece : getPieces()) {
            if (piece.getPieceType() == pieceType) {
                return piece;
            }
        }
        throw new PieceNotFoundException();
    }

    abstract public PlayerMove makeMove();
}
