public class main extends Object {
    public static void main(String[] args) {
        Student max=new Student("max",12);
        System.out.println(max);

        PrimarySchoolStudent jimmy=new PrimarySchoolStudent("jimmy",3,"Carol");
        System.out.println(jimmy);

    }
}
class Student{
    private String name;
    private int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name+" is "+age+" years old.";
    }
}
class PrimarySchoolStudent extends Student{
    private String ParentName;

    PrimarySchoolStudent(String name,int age,String ParentName){
        super(name,age);
        this.ParentName=ParentName;
    }

    @Override
    public String toString() {
        return ParentName +"'s kid," +super.toString();
    }
}
