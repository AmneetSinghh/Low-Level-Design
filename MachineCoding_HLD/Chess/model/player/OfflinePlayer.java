package MachineCoding_HLD.Chess.model.player;

import MachineCoding_HLD.Chess.enums.PlayerType;
import MachineCoding_HLD.Chess.model.Piece;

import java.util.List;

public class OfflinePlayer extends Player{

    public OfflinePlayer(PlayerType playerType, List<Piece> pieces) {
        super(PlayerType.MANUAL_PLAYER, pieces);
    }

    @Override
    public PlayerMove makeMove() {
        // select piece
        // get all possible moves
        // make move.
        // return cell and piece.
        return null;
    }
}
