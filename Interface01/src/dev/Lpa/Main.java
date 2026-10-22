package dev.Lpa;

public class Main {
    public static void main(String[] args) {
        Bird bird=new Bird();
        Animal animal=bird;
        FlightEnabled flier=bird;
        Trackable tracked=bird;
        animal.move();
//        flier.fly();
//        flier.land();
//        flier.takeoff();
//        tracked.track();
        inFlight(flier);
        inFlight(new Jet());
        Truck myTrck=new Truck();
        myTrck.track();


    }
    private static void inFlight(FlightEnabled flier){
    flier.takeoff();
    flier.fly();
    if(flier instanceof Trackable tracked){
        tracked.track();
    }
    flier.land();
    }
}
