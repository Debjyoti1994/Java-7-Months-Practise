package dev.Lpa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Park extends Point{
    private String name;
    private String type;

    private double[][]googleLocation;

    public Park(String name,String type, double[][] googleLocation) {
        this.name = name;
        this.googleLocation = googleLocation;
        this.type=type;
    }

    public Park(String name) {
//        this(name,"PARK");
        this.name = name;



    }

    public Park(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void addlocation(double lat, double longi){
        googleLocation=new double[][]{{lat,longi}};
    }
    public String printLocation(){
        for (var myarray:googleLocation){
            return (Arrays.toString(myarray));
        }
        return "";
    }
    @Override
    public String render() {
        return "RENDER "+name+" "+ (type==null?"Park":type)+" as POINT ("+ printLocation()+")";
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", googleLocation=" + Arrays.toString(googleLocation) +
                "} " + super.toString();
    }
}
