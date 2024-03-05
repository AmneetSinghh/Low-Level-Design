package Groww.Machine_Coding.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Enrollment {
    private UUID id;
    private Student student;
    private Subject subject;
}
