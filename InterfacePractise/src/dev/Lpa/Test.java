package dev.Lpa;

public class Test {
    public static void main(String[] args) {
//    inFlight(new Jet());
        orbit(new Satellite());
//    OrbitEarth.log("testing "+new Satellite());
        //Date and time its showing long format
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
        System.out.println("-X-".repeat(12));
    }

    private static void orbit(OrbitEarth flier) {
        flier.takeOff();

        flier.fly();
        flier.land();
        System.out.println("-X-".repeat(12));
    }

}
