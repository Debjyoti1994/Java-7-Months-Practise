package dev.Lpa;
record DragonFly(String name,String type)implements FlightEnabled{

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


}
interface Trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();
}
