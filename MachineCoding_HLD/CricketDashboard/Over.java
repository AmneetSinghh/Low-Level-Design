package MachineCoding_HLD.CricketDashboard;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
public class Over {
    private int number;
    private int runScored = 0;
    private int totalRunsInOver = 0;
    private List<Ball> balls;// balls->runs.

    public Over(int number){
        this.number = number;
        balls = new ArrayList<>();
    }

    private int getWicketsInOver() {
        int wkCount = 0;
        for (Ball ball : balls) {
            if (ball.getWicket() != null) {
                wkCount += 1;
            }
        }
        return wkCount;
    }
}
