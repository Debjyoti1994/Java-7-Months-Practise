package dev.Lpa;

public interface Schedule {
    default DaysOfTheWeek nextDaySchedule(DaysOfTheWeek curDay){
        DaysOfTheWeek nextDay=curDay.getNextDay();
        System.out.println("The day is changing from " +curDay+ " to "+nextDay);
        return nextDay;
    }
}
