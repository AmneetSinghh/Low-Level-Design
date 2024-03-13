package company_test.Groww.Machine_Coding.service;

import company_test.Groww.Machine_Coding.model.Class;
import company_test.Groww.Machine_Coding.model.*;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    List<Teacher> teacherList;
    ExamService examService;
    public TeacherService(ExamService examService){
        teacherList= new ArrayList<>();
        this.examService = examService;
    }

    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public Teacher getTeacherById(int id) throws Exception {
        for(Teacher teacher : teacherList){
            if(id== teacher.getTeacherId()){
                return teacher;
            }
        }
        throw new Exception("teacher not present");
    }

    public void teachSubject(Teacher teacher, Subject subject, List<Class> classes){ // math - 7,8
        if(teacher.getTeachSubjects() == null){
            teacher.setTeachSubjects(new ArrayList<>());
        }

        teacher.getTeachSubjects().add(subject);
        if(classes!=null){
            teacher.getTeachClasses().addAll(classes);
        }
    }

    public void addMarksForSubject(Teacher teacher, Subject subject, Exam exam, Student student, int markValue){
        Marks marks = new Marks();
        marks.setSubject(subject);
        marks.setExam(exam);
        marks.setStudent(student);
        marks.setUploadedBy(teacher);
        marks.setMarks(markValue);
        examService.addMark(marks);
    }

    public void editMarksForSubject(Teacher teacher, Subject subject, Exam exam, Student student,int markValue){ // math - 7,8
        Marks marks = new Marks();
        marks.setSubject(subject);
        marks.setExam(exam);
        marks.setStudent(student);
        marks.setUploadedBy(teacher);
        marks.setMarks(markValue);
        examService.updateMark(marks);
    }

}
