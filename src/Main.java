import Grade.java;
import Group.java;

public class Main {
    Grade grade = new Grade();
    grade.setGrade("B");
    Group group = new Group();
    group.setGroup(3);


    Student student = new Student("Maya",grade,group,"Pappu");
    System.out.println("----------------"+student.getStudentname());
}
