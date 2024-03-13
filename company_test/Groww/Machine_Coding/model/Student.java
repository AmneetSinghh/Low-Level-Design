package company_test.Groww.Machine_Coding.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student extends User{
    private int studentId;
    private School school;
    private Class classNo;
    private long joinedAt;
    private List<Subject> enrolledSubjects;
    private long classStartYear;
    private long classEndYear;
}
