package dev.Lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek[] myweek = DaysOfTheWeek.values();
        for (DaysOfTheWeek my : DaysOfTheWeek.values()) {
            System.out.println(my);
        }
        System.out.println("--".repeat(12));
//        for (int i = 0; i < 10; i++) {
//            DaysOfTheWeek myweek1 = myweek[returnDay()];
//            int index = myweek1.ordinal();
//            System.out.println("Ordinal is :->" + index);
//            System.out.println(myweek1.ordinal());
//            System.out.printf("Name is %s,Ordinal Vale =%d%n", myweek1.name(), myweek1.ordinal());
//            System.out.println("-X-".repeat(12));
//        }

//            DaysOfTheWeek myDay=myweek[returnDay()];
//            System.out.println("Current Day :"+myDay);
//            DaysOfTheWeek nextDay=getNextDay2(myDay);
//            System.out.println("Next Day :"+nextDay);
//            System.out.println("-X-".repeat(12));
        Plan newPlan=new Plan();
        newPlan.nextDaySchedule(DaysOfTheWeek.MONDAY);

    }
    public static DaysOfTheWeek getNextDay2(DaysOfTheWeek currentDay){
        DaysOfTheWeek[] myWeek=DaysOfTheWeek.values();
        return myWeek[(currentDay.ordinal()+1)% myWeek.length];


    }

    public static int returnDay() {
        Random myrandom = new Random();
        int newN0 = myrandom.nextInt(7);
        return newN0;
    }



}
