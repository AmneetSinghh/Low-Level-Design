package MachineCoding_HLD.CricketDashboard;

import MachineCoding_HLD.CricketDashboard.enums.RunType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Run {
    private int scoreRun;
    private RunType runType;
}
