package MachineCoding_HLD.CricketDashboard;

import MachineCoding_HLD.CricketDashboard.actor.Player;
import MachineCoding_HLD.CricketDashboard.enums.BallType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Ball {
    private int overNumber;
    private BallType ballType;
    private Player bowledBy;
    private Player facedBy;
    private Run run;
    private Wicket wicket;

    public Ball(int overNumber, Player bowledBy, Player facedBy) {
        this.overNumber = overNumber;
        this.bowledBy = bowledBy;
        this.facedBy = facedBy;
    }
}
