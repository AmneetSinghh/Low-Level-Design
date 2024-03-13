package company_test.Groww.Machine_Coding.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exam {
    private int examId;
    private Subject subject;// english
    private long examDate;// epoch
    private Teacher examTakenBy;
}
