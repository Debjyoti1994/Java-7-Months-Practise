package dev.Lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        LinkedList<FlightEnabled> fliers=new LinkedList<>();
        fliers.add(bird);
        List<FlightEnabled>betterFliers=new LinkedList<>();
        betterFliers.add(bird);
//example  of coding to interface....
        //here list as interface can accept both linked list and array list

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);


    }
    private static void inFlight(FlightEnabled flier){
    flier.takeoff();
    flier.fly();
    if(flier instanceof Trackable tracked){
        tracked.track();
    }
    flier.land();
    }
    private static void triggerFliers(List<FlightEnabled>fliers){
        for(var flier:fliers){
            flier.takeoff();
        }
        }
    private static void flyFliers(List<FlightEnabled>fliers){
        for(var flier:fliers){
            flier.fly();
        }
    }
    private static void landFliers(List<FlightEnabled>fliers){
        for(var flier:fliers){
            flier.land();
        }
    }
}
