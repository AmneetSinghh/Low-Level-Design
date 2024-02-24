package MachineCoding_HLD.CricketDashboard;

import MachineCoding_HLD.CricketDashboard.actor.Player;
import MachineCoding_HLD.CricketDashboard.enums.WicketType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PlayerScoreCard {
    private Player player;
    private int runScored;
    private boolean isOut;
    private int totalSix;
    private int totalFour;
    private WicketType wicketType;
    private Player outByBowler;

    public PlayerScoreCard(Player facedBy) {
        this.player = facedBy;
    }
}

