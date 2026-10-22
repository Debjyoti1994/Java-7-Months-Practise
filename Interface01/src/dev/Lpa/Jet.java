package dev.Lpa;

public class Jet implements FlightEnabled,Trackable {
    public void move() {
        System.out.printf("%12s%n","Flap wings");
    }

    @Override
    public void takeoff() {
        System.out.printf(getClass().getSimpleName()+"%12s%n"," is taking off");
    }

    @Override
    public void land() {
        System.out.printf(getClass().getSimpleName()+"%12s%n"," is landing");
    }

    @Override
    public void fly() {
        System.out.printf(getClass().getSimpleName()+"%12s%n"," is flying off");

    }

    @Override
    public void track() {
        System.out.printf(getClass().getSimpleName()+"%12s%n"," coordinates were recorded");
    }
}
