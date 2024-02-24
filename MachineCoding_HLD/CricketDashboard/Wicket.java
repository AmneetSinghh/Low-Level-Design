package MachineCoding_HLD.CricketDashboard;

import LLD.GAMES.Snake_And_Ladder.Player;
import MachineCoding_HLD.CricketDashboard.enums.WicketType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Wicket {
    private WicketType wicketType;
    private Player playerOut;
    private Player bowledBy;
    private Player catchBy;
    private Player stumpedBy;
    private Player runOutBy;

    public Wicket(WicketType wicketType, Player playerOut,
                  Player bowledBy, Player catchBy, Player stumpedBy,
                  Player runOutBy) {
        this.wicketType = wicketType;
        this.playerOut = playerOut;
        this.bowledBy = bowledBy;
        this.catchBy = catchBy;
        this.stumpedBy = stumpedBy;
        this.runOutBy = runOutBy;
    }
}
