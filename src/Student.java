import Grade.java;
import Group.java;
public class Student implements StudentInterface {
    private final String studentName;
    private int id;


    private String studentName;
    private Grade grade;
    private Group group;
    private String secretNickName;


    //constructor
    public Student(String studentName,Grade grade,Group group,String nickName) {
        this.studentName = studentName;
        this.grade = grade;
        this.group = group;
        this.secretNickName = nickName;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setSecretNickName(String secretNickName) {
        this.secretNickName = secretNickName;
    }
    public String getStudentname() {
        return studentname;
    }

    public Grade getGrade() {
        return grade;
    }

    public Group getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }


    @Override
    public String getName(Student student) {
        return student.getStudentname();
    }

    @Override
    public char upgrade(Student student) {
        char grade = student.getGrade().getGrade();
        return (char) (grade-1);
    }

    @Override
    public char downGrage(Student student) {
        char grade = student.getGrade().getGrade();
        return (char) (grade+1);
    }

    @Override
    public int updateGroup(Student student) {
        return 0;
    }
}


