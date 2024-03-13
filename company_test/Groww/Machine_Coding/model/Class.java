package company_test.Groww.Machine_Coding.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Class {
    private UUID id;
    private int classNo;
    private List<Subject> subjectList;
}
