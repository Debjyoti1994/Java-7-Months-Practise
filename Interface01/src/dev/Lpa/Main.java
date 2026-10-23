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
        Truck myTruck=new Truck();
        myTruck.track();
        //
        double kmTravelled=100;
        double milesTraveled=kmTravelled*FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",kmTravelled,milesTraveled);


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
