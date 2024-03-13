package MachineCoding_HLD.CricketDashboard;

import MachineCoding_HLD.CricketDashboard.match.Match;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Data
@Getter
@Setter

/* Score card for match-innings */
public class Scorecard {
    // persist Map<match,Map,inningNumber,scorecard >>>
    private Match match;
    private Innings innings;
    private Map<String, PlayerScoreCard> playerScores = new HashMap<>();
    private Map<String, BowlerScoreCard> bowlerOvers = new HashMap<>();
    private int totalRuns;
    private int totalWickets;
    private int extraScore;

    public Scorecard(Match match, Innings innings) throws Exception {
        this.match = match;
        this.innings = innings;
    }

    // update it.
    public void updateScore(Ball ball){
        // update each score in every place.
        addOver(ball);
        switch (ball.getBallType()){
            case WIDE:
                updateExtras(ball);
                break;
            case NORMAL:{
                PlayerScoreCard playerScoreCard = getOrCreatePlayerScore(ball);
                incrementScore(ball);
            }
            case WICKET:{
                BowlerScoreCard bowlerOver = setBowlerOverForBall(ball);
            }
        }

    }

    private void addOver(Ball ball){
        // add over to innings.
        // set ball in overs.
    }

    private PlayerScoreCard getOrCreatePlayerScore(Ball ball) {
        PlayerScoreCard playerScore = this.playerScores.get(ball.getFacedBy());
        if (playerScore == null) {
            playerScore = new PlayerScoreCard(ball.getFacedBy());
            playerScores.put(ball.getFacedBy().getName(), playerScore);
        }
        return playerScore;
    }

    private BowlerScoreCard setBowlerOverForBall(Ball ball) {
        BowlerScoreCard bowlerOver = this.bowlerOvers.get(ball.getBowledBy());
        if (bowlerOver == null) {
            bowlerOver = new BowlerScoreCard(ball.getBowledBy());
            bowlerOvers.put(ball.getBowledBy().getName(), bowlerOver);
        }
        bowlerOver.getOverMap().putIfAbsent(ball.getOverNumber(), new Over(ball.getOverNumber()));
        return bowlerOver;
    }

    private void updateExtras(Ball ball){
        switch (ball.getRun().getRunType()){
            case ONE :
                extraScore+=1;
            case TWO:
                extraScore+=2;
            case THREE:
                extraScore+=3;
            case FOUR:
                extraScore+=4;
        }
    }

    public void incrementScore(Ball ball){
        /*
         * Player stats
         * innings player score
         * everywhere.
         */
    }
}

