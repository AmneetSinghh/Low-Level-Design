package Groww.Machine_Coding.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Teacher extends User{
    private int teacherId;
    private List<Subject> teachSubjects;
    private List<Class> teachClasses;//
}
