package MachineCoding_HLD.CricketDashboard.actor;


import MachineCoding_HLD.CricketDashboard.PlayerStats;
import MachineCoding_HLD.CricketDashboard.enums.PlayerResponsibility;
import MachineCoding_HLD.CricketDashboard.enums.PlayerType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player extends Person{
    public Player(String name) {
        super(name);
    }
    private PlayerType playerType;
    private PlayerResponsibility playerResponsibility;
    PlayerStats playerStats;
}
