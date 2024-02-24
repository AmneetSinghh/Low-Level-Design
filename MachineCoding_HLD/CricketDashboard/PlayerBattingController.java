package MachineCoding_HLD.CricketDashboard;

import LLD.GAMES.Snake_And_Ladder.Player;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.Queue;

@Getter
@Setter
public class PlayerBattingController {
    private Queue<Player> yetToPlay;
    private Player striker;
    private Player nonStriker;

    public PlayerBattingController(Queue<Player> players){// 10 players.
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(players);
    }

    public void getNextPlayer() {
        if (striker == null) {
            striker = yetToPlay.poll();
        }
        if (nonStriker == null) {
            nonStriker = yetToPlay.poll();
        }
    }

}
