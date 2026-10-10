package dev.Lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GradeBook myGrade=new GradeBook("Maths",new ArrayList<>(List.of(new Student("Ram",
                new ArrayList<>(List.of(10.00,20.00))))));

        myGrade.addStudent("Rakesh",34);
        myGrade.addStudent("Suresh",348);
        myGrade.addStudent("Rakesh",349);
        myGrade.addGrade("Tiny",78);
        myGrade.addGrade("Suresh",-78);

        System.out.println(myGrade);
        myGrade.printStudentReport("Rakesh");
    }
}
