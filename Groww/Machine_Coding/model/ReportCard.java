package Groww.Machine_Coding.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class ReportCard {
    private UUID reportCardId;
    Map<Exam, List<Marks>> examListMap;
}
