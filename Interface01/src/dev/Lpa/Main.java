package dev.Lpa;

public class Main {
    public static void main(String[] args) {
        Bird bird=new Bird();
        Animal animal=bird;
        FlightEnabled flier=bird;
        Trackable tracked=bird;
        animal.move();
        flier.fly();
        flier.land();
        flier.takeoff();
        tracked.track();


    }
}
