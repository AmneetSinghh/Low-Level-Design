package MachineCoding_HLD.CricketDashboard;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Innings {
    private int inningsNumber;
    private int inningsName;
    private Map<Integer, Over> overs;
    Team battingTeam;
    Team bowlingTeam;

    public Innings(int inningsNumber) {
        this.inningsNumber = inningsNumber;
        overs = new HashMap<>();
    }
}
