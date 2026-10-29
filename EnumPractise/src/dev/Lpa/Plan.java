package dev.Lpa;

public class Plan implements Schedule{
    @Override
    public DaysOfTheWeek nextDaySchedule(DaysOfTheWeek curDay) {
        System.out.println(getClass().getSimpleName()+ " is on progress");
        return Schedule.super.nextDaySchedule(curDay);
    }
}
