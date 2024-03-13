package company_test.Groww.Machine_Coding.service;

import company_test.Groww.Machine_Coding.model.Enrollment;
import company_test.Groww.Machine_Coding.model.Exam;
import company_test.Groww.Machine_Coding.model.Student;
import company_test.Groww.Machine_Coding.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> studentList;
    List<Enrollment> subjectEnrollmentList;
    ExamService examService;

    public StudentService(ExamService examService){
        studentList= new ArrayList<>();
        subjectEnrollmentList = new ArrayList<>();
        this.examService = examService;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public Student getStudentById(int id) throws Exception {
        for(Student student : studentList){
            if(id== student.getStudentId()){
                return student;
            }
        }
        throw new Exception("Student not present");
    }

    public void enrollIntoSubject(Student student, Subject subject){
        if(student.getEnrolledSubjects() == null){
            student.setEnrolledSubjects( new ArrayList<>());
        }
        student.getEnrolledSubjects().add(subject);
    }

    public void viewExamMark(Student student, Exam exam) throws Exception {
        examService.viewMark(student,exam);
    }


}
