package dev.Lpa;

public class Test {
    public static void main(String[] args) {
    inFlight(new Jet());
    OrbitEarth.log("testing "+new Satellite());
    //Date and time its showing long format
    }
    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
        System.out.println("-X-".repeat(12));
    }

}
