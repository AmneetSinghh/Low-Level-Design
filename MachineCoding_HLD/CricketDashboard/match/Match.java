package MachineCoding_HLD.CricketDashboard.match;

import MachineCoding_HLD.CricketDashboard.Innings;
import MachineCoding_HLD.CricketDashboard.Scorecard;
import MachineCoding_HLD.CricketDashboard.Team;
import MachineCoding_HLD.CricketDashboard.enums.MatchState;
import MachineCoding_HLD.CricketDashboard.enums.MatchType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public abstract class Match {
    private String matchId;
    private String matchName;
    private Team team1;
    private Team team2;
    private String venue;
    private long startTime;
    private long endTime;
    private String winnerTeam; // team name.
    private String lostTeam;   // team.
    private MatchState matchState;
    private Map<Integer, Innings> innings;
    private Scorecard scorecard;
    private MatchType matchType;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        innings = new HashMap<>();
    }
}
