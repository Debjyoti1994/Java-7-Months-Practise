public class main {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            LpaStudent s=new LpaStudent("s1222"+i,
                    switch (i){
                case 1->"Mary";
                case 2->"Trisha";
                case 3->"Mark";
                case 4->"Stacy";
                case 5->"Chrstie";
                        default -> "Annonomyus";


                    },"8/12/1886","JavaMaterClass");
            System.out.println(s);
        }
        Student pojoStudent=new Student("S923006","Tracy","1/12/19888",
                "JAVA MASTER CLASS");
        LpaStudent recordStudent=new LpaStudent("S923007",
                "Rihanna",
                "20/11/1994",
                "JAVA MASTERCLASS");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
            pojoStudent.setStudentClassList(pojoStudent.getStudentClassList()+" ,JAVA OCP 2029.");
//            recordStudent.setStudentClassList(recordStudent.getStudentClassList()+" ,JAVA OCP 2029.");
        System.out.println(pojoStudent.getStudentName()+" is taking "+pojoStudent.getStudentClassList());
        System.out.println(recordStudent.studentName()+" is taking "+recordStudent.studentClassList());

    }
}
