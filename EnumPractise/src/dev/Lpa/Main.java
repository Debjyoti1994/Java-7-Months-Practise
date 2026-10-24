package dev.Lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek[] myweek=DaysOfTheWeek.values();
        for(DaysOfTheWeek my:DaysOfTheWeek.values()){
            System.out.println(my);
        }
        for (int i = 0; i < 10; i++) {
            DaysOfTheWeek myweek1=myweek[returnDay()];
            System.out.println(myweek1.ordinal());
            System.out.printf("Name is %s,Ordinal Vale =%d%n",myweek1.name(),myweek1.ordinal());
        }
       
    }
    public static int returnDay(){
        Random myrandom=new Random();
        int newN0=myrandom.nextInt(7);
        return newN0;
    }
}
