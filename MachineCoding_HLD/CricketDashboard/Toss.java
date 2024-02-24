package MachineCoding_HLD.CricketDashboard;

import MachineCoding_HLD.CricketDashboard.enums.TossAction;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Toss {
    private String tossedBy;
    private String askedBy;
    private Team wonByTeam;
    private TossAction tossAction;
}
