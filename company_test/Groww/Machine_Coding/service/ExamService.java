package company_test.Groww.Machine_Coding.service;

import company_test.Groww.Machine_Coding.model.Exam;
import company_test.Groww.Machine_Coding.model.Marks;
import company_test.Groww.Machine_Coding.model.ReportCard;
import company_test.Groww.Machine_Coding.model.Student;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter
public class ExamService {
    private List<Exam> examList;
    private Map<Exam,List<Marks>> examListMap;           // exam , subject.
    Map<Student, ReportCard> reportCardMap = new HashMap<>();

    public ExamService(){
        examList = new ArrayList<>();
        examListMap = new HashMap<>();
        reportCardMap = new HashMap<>();
    }

    public void addExam(Exam exam){
        examList.add(exam);
    }

    public Exam getExamById(int id) throws Exception {
        for(Exam exam : examList){
            if(id== exam.getExamId()){
                return exam;
            }
        }
        throw new Exception("Exam not present");
    }

    public void addMark(Marks marks) {
        if (!examListMap.containsKey(marks.getExam())) {
            examListMap.put(marks.getExam(), new ArrayList<>());
        }
        examListMap.get(marks.getExam()).add(marks);
    }

    public void updateMark(Marks marks) {
        if (!examListMap.containsKey(marks.getExam())) {
            examListMap.put(marks.getExam(), new ArrayList<>());
        }
        // update marks.
        List<Marks> examMarks = examListMap.get(marks.getExam());
        for(Marks marks1 : examMarks){
            if(marks1.getMarkId() == marks.getMarkId()){
                examMarks.remove(marks1);
                break;
            }
        }
        // update in db.
        examListMap.get(marks.getExam()).add(marks);
    }

    public Marks viewMark(Student student, Exam exam) throws Exception {
        if (examListMap.containsKey(exam)) {
            List<Marks> marks = examListMap.get(exam);
            for(Marks marks1 : marks){
                if(marks1.getStudent().equals(student)){
                    return marks1;
                }
            }
        }
        else{
            throw new Exception("Exam not present");
        }
        return null;
    }

    // report card.
    public ReportCard getReportCard(Student student){
        if(reportCardMap.containsKey(student)){
            return reportCardMap.get(student);
        }
        // create report card.
        Map<Exam,List<Marks>> marksMap = new HashMap<>();

        for (Map.Entry<Exam, List<Marks>> examListEntry : examListMap.entrySet()) {
            List<Marks> marks = examListEntry.getValue();
            for (Marks marks1 : marks) {
                if (marks1.getStudent().equals(student)) {

                    if(!marksMap.containsKey(examListEntry.getKey())){
                        marksMap.put(examListEntry.getKey(), new ArrayList<>());
                    }
                    marksMap.get(examListEntry.getKey()).add(marks1);
                }
            }
        }
        reportCardMap.put(student,new ReportCard(UUID.randomUUID(),marksMap));
        return reportCardMap.get(student);
    }

}
