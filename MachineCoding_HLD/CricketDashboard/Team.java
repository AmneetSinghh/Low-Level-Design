package MachineCoding_HLD.CricketDashboard;

import LLD.GAMES.Snake_And_Ladder.Player;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
@Getter
@Setter
public class Team {
    private String teamName;
    private List<Player> players;// 10
    private List<Player> bench;// 6
    public PlayerBattingController battingController;
    public PlayerBowlingController bowlingController;
    public boolean isWinner;
}
