package Groww.Machine_Coding;

import Groww.Machine_Coding.model.*;
import Groww.Machine_Coding.service.ExamService;
import Groww.Machine_Coding.service.StudentService;
import Groww.Machine_Coding.service.TeacherService;

import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        // make student.
        ExamService examService = new ExamService();
        StudentService studentService = new StudentService(examService);
        TeacherService teacherService = new TeacherService(examService);
        // teacher
        Teacher teacher = new Teacher();
        teacher.setTeacherId(1);
        teacher.setFirstName("Sanjana");


        teacherService.addTeacher(teacher);

        // subject.
        Subject subject = new Subject();
        subject.setSubjectId(1);
        subject.setTeacher(teacher);
        subject.setName("Maths");

        Subject subject1 = new Subject();
        subject1.setSubjectId(2);
        subject1.setTeacher(teacher);
        subject1.setName("english");

        teacherService.teachSubject(teacher,subject,null);
        teacherService.teachSubject(teacher,subject1,null);


        // student.
        Student student = new Student();
        student.setStudentId(1);
        student.setFirstName("rahul");
        studentService.addStudent(student);

        Student student1 = new Student();
        student1.setStudentId(2);
        student1.setFirstName("amneet");
        studentService.addStudent(student1);


        // subject enrollmeent,
        studentService.enrollIntoSubject(student,subject);
        studentService.enrollIntoSubject(student,subject1);

        studentService.enrollIntoSubject(student1,subject);
        studentService.enrollIntoSubject(student1,subject1);



        // exam.
        Exam exam  = new Exam();
        exam.setExamDate(System.currentTimeMillis());
        exam.setExamTakenBy(teacher);
        exam.setSubject(subject);
        exam.setExamId(1);
        examService.addExam(exam);



        // upload marks

        teacherService.addMarksForSubject(teacher,subject,exam,student,10);
        teacherService.addMarksForSubject(teacher,subject,exam,student,20);

        teacherService.addMarksForSubject(teacher,subject1,exam,student1,10);
        teacherService.addMarksForSubject(teacher,subject1,exam,student1,20);


        // get reportCard.
        ReportCard reportCard = examService.getReportCard(student);
        System.out.println("Get result for student : "+ student.getFirstName());
        System.out.println(" -- -- - - List of exams -- -- - -");
        for(Map.Entry<Exam,List<Marks>> examMark : reportCard.getExamListMap().entrySet()){
            System.out.println("Exam : "+ examMark.getKey().getExamId()+ " Subject : "+ examMark.getKey().getSubject().getName() );
            for(Marks marks : examMark.getValue()){
                System.out.println("Subject : "+ marks.getSubject().getName()+ " Marks : "+ marks.getMarks());
            }
        }

    }

}
