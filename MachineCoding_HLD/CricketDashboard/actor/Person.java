package MachineCoding_HLD.CricketDashboard.actor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private String name;
    private String phoneNumber;
    private String email;
    private String personalInfo;

    public Person(String name) {
        this.name = name;
    }
}
