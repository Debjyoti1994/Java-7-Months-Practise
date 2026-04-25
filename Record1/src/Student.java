public class Student {
    private String StudentId;
    private String StudentName;
    private String StudentDateOfBirth;
    private String StudentClassList;

    public Student(String studentId, String studentName, String studentDateOfBirth, String studentClassList) {
        StudentId = studentId;
        StudentName = studentName;
        StudentDateOfBirth = studentDateOfBirth;
        StudentClassList = studentClassList;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentDateOfBirth() {
        return StudentDateOfBirth;
    }

    public void setStudentDateOfBirth(String studentDateOfBirth) {
        StudentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentClassList() {
        return StudentClassList;
    }

    public void setStudentClassList(String studentClassList) {
        StudentClassList = studentClassList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId='" + StudentId + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentDateOfBirth='" + StudentDateOfBirth + '\'' +
                ", StudentClassList='" + StudentClassList + '\'' +
                '}';
    }
}
