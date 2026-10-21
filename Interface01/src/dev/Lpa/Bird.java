package dev.Lpa;

public class Bird extends Animal implements FlightEnabled,Trackable{
    @Override
    public void move() {
        System.out.printf("%12s%n","Flap wings");
    }
}
