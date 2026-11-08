package dev.Lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class River extends Line{
    private String name;
    private String type;

    private ArrayList<ArrayList<Double>>googleLocation;

    public River(String name, String type, ArrayList<ArrayList<Double>>googleLocation) {
        this.name = name;
        this.googleLocation = googleLocation;
        this.type=type;
    }

    public River(String name) {
//        this(name,"River");
        this.name = name;



    }

    public River(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void addlocation(double lat, double longi){
        googleLocation=new ArrayList<>();
        ArrayList<Double>g1=new ArrayList<>();
        g1.add(lat);
        g1.add(longi);
        googleLocation.add(g1);

    }
    public String printLocation(){
        for (var myarray:googleLocation){
            for (var myarray2:myarray)
            return ""+(myarray2);
        }
        return "";
    }
    @Override
    public String render() {
        return "RENDER "+name+" "+ (type==null?"River":type)+" as Line ("+ printLocation()+")";
    }

    @Override
    public String toString() {
        return "River{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", googleLocation=" + printLocation() +
                "} " + super.toString();
    }
}
