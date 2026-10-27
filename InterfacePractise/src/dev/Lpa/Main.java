package dev.Lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        Truck myTrck=new Truck();
        myTrck.track();
        double kmsTraveled=100;
        double milesTraveled=kmsTraveled*FlightEnabled.KM_TO_MILES;
        System.out.printf("%.2f Km or %.2f miles is traveled truck. %n",kmsTraveled,milesTraveled);

        LinkedList<FlightEnabled> fliers=new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled>betterFliers=new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
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
    //Coding to an interface
    private static void triggerFliers(List<FlightEnabled>fliers){
        for (var flier:fliers){
            flier.takeOff();
        }
    }
    private static void flyFliers(List<FlightEnabled>fliers){
        for (var flier:fliers){
            flier.fly();
        }
    }
    private static void landFliers(List<FlightEnabled>fliers){
        for (var flier:fliers){
            flier.land();
        }
    }


}
