package dev.Lpa;

public class Truck  implements Trackable{
    @Override
    public void track() {
        System.out.printf(getClass().getSimpleName()+"%12s%n"," coordinates were recorded");
    }
}
