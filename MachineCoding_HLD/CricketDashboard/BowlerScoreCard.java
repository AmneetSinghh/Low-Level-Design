package MachineCoding_HLD.CricketDashboard;

import MachineCoding_HLD.CricketDashboard.actor.Player;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Data
public class BowlerScoreCard {
    private Player bowler;
    private Map<Integer,Over> overMap;// check total scores he made, by this map.
    private List<Wicket> wicketsTaken;

    public BowlerScoreCard(Player bowledBy) {
    }
}
