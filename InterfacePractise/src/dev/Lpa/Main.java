package dev.Lpa;

public class Main {
    public static void main(String[] args) {
        //Interface can not instantiate object
        //They can use bird class as bird implements trackable,Flight enabled
        Bird bird=new Bird();
        Animal animal=bird;
        FlightEnabled flier=bird;
        Trackable tracked=bird;
        bird.move();
//        animal.move();
//        flier.move();
//        tracked.move();
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();
        inFlight(flier);
        inFlight(new Jet());

    }
    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
        System.out.println("-X-".repeat(12));
    }
}
