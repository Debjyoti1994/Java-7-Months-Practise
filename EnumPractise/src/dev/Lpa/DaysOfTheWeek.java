package dev.Lpa;

public enum DaysOfTheWeek{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY, THURSDAY,FRIDAY,SATURDAY;
    public DaysOfTheWeek getNextDay(){
        DaysOfTheWeek[] myWeek=values();
        return myWeek[(ordinal()+1)% myWeek.length];


    }
}
