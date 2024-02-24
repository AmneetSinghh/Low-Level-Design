package MachineCoding_HLD.CricketDashboard.repository;

import MachineCoding_HLD.CricketDashboard.Scorecard;
import MachineCoding_HLD.CricketDashboard.Team;
import MachineCoding_HLD.CricketDashboard.actor.Player;
import MachineCoding_HLD.CricketDashboard.match.Match;

import java.util.HashMap;
import java.util.Map;

public class Database {
    public static Map<String, Match> matchMap = new HashMap<>();
    public static Map<String, Team> teamMap = new HashMap<>();
    public static Map<String, Player> playerMap = new HashMap<>();
    public static Map<String, Map<Integer, Scorecard>> scoreCardMap = new HashMap<>();
    // matchName inningsName scoreCard;
}
