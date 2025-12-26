public class Main extends Object {
    public static void main(String[] args) {
        Student max=new Student("Max",56);
        System.out.println(max);
        PrimarySchoolStudent jimmy=new PrimarySchoolStudent("jimmy",8,"carol");
        System.out.println(jimmy);
    }}
    class Student{
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name+ " is age "+age;
//                    "Student{" +
//                    "age=" + age +
//                    ", name='" + name + '\'' +
//                    '}';
        }
    }
    class PrimarySchoolStudent extends Student{

    private String parentName;


        public PrimarySchoolStudent(String name, int age, String parentName) {
            super(name, age);
            this.parentName = parentName;
        }

        @Override
        public String toString() {
            return parentName+"'s kid, " + super.toString();
        }
    }

