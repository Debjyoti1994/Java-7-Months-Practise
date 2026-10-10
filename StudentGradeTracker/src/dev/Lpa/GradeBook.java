package dev.Lpa;

import java.util.ArrayList;
import java.util.List;

public record GradeBook(String courseName, ArrayList<Student>newStudent) {
    @Override
    public String toString() {
        return "GradeBook{" +
                "courseName='" + courseName + '\'' +
                ", newStudent=" + newStudent +
                '}';
    }

    public void addStudent(String studentName, double initialGrade){
        var iterator=newStudent.listIterator();
        while (iterator.hasNext()){
            Student myStudent=iterator.next();
            if(myStudent.name().equalsIgnoreCase(studentName)){
                myStudent.grades().add(initialGrade);
                System.out.println("Student has been enrolled");
                return;
            }
        }
        System.out.println("Student has not been enrolled");
        newStudent.add(new Student(studentName,new ArrayList<>(List.of(initialGrade))));


    }
    public void addGrade(String studentName,double grade){
        for (Student myStudent:newStudent){
            if (myStudent.name().equalsIgnoreCase(studentName)){
                myStudent.grades().add(grade);
                return;
            }
        }
        System.out.println(studentName+ " not found");
    }
    public  void printStudentReport(String studentName){
        var iterator2=newStudent.listIterator();
        while (iterator2.hasNext()){
            Student mystudent=iterator2.next();
            if (mystudent.name().equalsIgnoreCase(studentName)){
                double averege=0;
                for (int i = 0; i <mystudent.grades().size() ; i++) {
                    averege+= mystudent.grades().get(i);

                }
                double finalAverege=averege/(mystudent.grades().size());
                System.out.println(studentName +" has an averege grade of "+finalAverege+
                        "and all of his grades are "+mystudent.grades());
            }
        }
    }
}
