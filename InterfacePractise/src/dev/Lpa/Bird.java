package dev.Lpa;

public class Bird extends Animal implements FlightEnabled,Trackable {
    @Override
    public void move() {
        System.out.println("Flap wings");
    }
}
