package dev.Lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class River extends Line{
    private final String name;
    private double latitude;
    private double  longitude;
List<List<Double>>GoggleLocaion=new ArrayList<>();
    public River(String name, double latitude, double longitude) {
        this.name = name;

      GoggleLocaion.add(new ArrayList<>(Arrays.asList(latitude,longitude)));
    }
public void addMoreRiverCordinates(double lat,double longi){
    GoggleLocaion.add(new ArrayList<>(Arrays.asList(lat,longi)));
}


    @Override
    public void render() {
        System.out.println("Render "+name+" as LINE"+ GoggleLocaion);
    }
}
