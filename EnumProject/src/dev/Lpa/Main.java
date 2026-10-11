package dev.Lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
//            System.out.printf("Name is %s,Ordinary Value =%d%n", weekDay.name(), weekDay.ordinal());
//            if (weekDay==DayOfTheWeek.FRI){
//                System.out.println("Friday is found!");
//            }
            switchDayofWeek(weekDay);
        }
        for(Topping mytopping:Topping.values()){
            System.out.println(mytopping.name()+" has a price of: "+mytopping.getPrice());
        }
    }
    public static void switchDayofWeek(DayOfTheWeek weekDay){
        int weekDayInteger=weekDay.ordinal()+1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day "+weekDayInteger);
            case SAT -> System.out.println("Saturday is Day "+weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)+weekDay.name().substring(1).toLowerCase()+"day is " +
                    "Day "+weekDayInteger);

        }

    }
    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}
