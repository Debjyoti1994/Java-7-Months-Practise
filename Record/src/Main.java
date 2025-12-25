public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent mySTUDENT = new LPAStudent(
                    "87977" + i, switch (i) {
                case 1 -> "Harry";
                case 2 -> "Roxy";
                case 3 -> "Stepanie";
                case 4 -> "Julie";
                case 5 -> "Cherry";
                default -> "Annoymous";
            }, "2020", "ghjg"
            );
            System.out.println(mySTUDENT);
            Student pojoStudent = new Student("776766", "HARRY", "20/11/1900",
                    "JAVA MASTERCASS");
            LPAStudent recordStudent=new LPAStudent("288979","JACOB","12/1/1898",
                    "JAVA MASTERCASS");
            pojoStudent.setClassList(pojoStudent.getClassList()+" java 89");
//            recordStudent.setClassList()
            System.out.println(pojoStudent);
            System.out.println(recordStudent);
            System.out.println(pojoStudent.getStudentName()+" is attending "+pojoStudent.getClassList());
            System.out.println(recordStudent.studentName()+" is attending "+recordStudent.classList());
        }

    }
}
