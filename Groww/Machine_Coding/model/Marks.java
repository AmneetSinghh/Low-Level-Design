package Groww.Machine_Coding.model;

// rahul 10Mark english amrita.
// samrita 20mark hindi amrita.

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Marks {
    private int MarkId;
    private Subject subject;
    private Student student;
    private Teacher uploadedBy;
    private int marks;
    private Exam exam;
    private long createdAt;
    private long updatedAt;
}
