package dev.Lpa;
enum FlightStages implements Trackable{
    GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;



    @Override
    public void track() {
        if(this!=GROUNDED){
            System.out.println("Monitoring "+this);
        }

    }
}
record DragonFly(String name,String type) implements FlightEnabled{

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class satellite implements OrbitEarth{
    public void achiveOrbit(){
        System.out.println("Orbit has been reached");
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends FlightEnabled{
    void achiveOrbit();
}
interface FlightEnabled{
    double MILES_TO_KM=1.60934;
    double KM_TO_MILES=0.621371;
void takeoff();
void land();
void fly();
default FlightStages transition(FlightStages stages){
    System.out.println(" transition not implemented on"+getClass().getSimpleName());
    return null;
}

}
interface Trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();
}
