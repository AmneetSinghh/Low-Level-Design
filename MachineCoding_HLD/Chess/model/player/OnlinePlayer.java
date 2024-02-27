package MachineCoding_HLD.Chess.model.player;

import MachineCoding_HLD.Chess.enums.PlayerType;
import MachineCoding_HLD.Chess.model.Piece;

import java.util.List;

public class OnlinePlayer extends Player{

    public OnlinePlayer(PlayerType playerType, List<Piece> pieces) {
        super(PlayerType.NETWORK_PLAYER, pieces);
    }

    @Override
    public PlayerMove makeMove() {
        return null;
    }
}

