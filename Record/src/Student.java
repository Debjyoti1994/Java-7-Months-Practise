public class Student {
    private String StudentID;
    private String StudentName;
    private String DateOfBirth;
    private String ClassList;

    public Student(String studentID, String studentName, String dateOfBirth, String classList) {
        StudentID = studentID;
        StudentName = studentName;
        DateOfBirth = dateOfBirth;
        ClassList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", ClassList='" + ClassList + '\'' +
                '}';
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return ClassList;
    }

    public void setClassList(String classList) {
        ClassList = classList;
    }
}
