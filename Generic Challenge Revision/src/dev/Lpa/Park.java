package dev.Lpa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Park extends Point{
    private final String name;
    private double latitude;
    private double  longitude;
double[]GoggleLocaion;
    public Park(String name, double latitude, double longitude) {
        this.name = name;

      GoggleLocaion=new double[]{latitude,longitude};
    }

    @Override
    public void render() {
        System.out.println("Render "+name+" PARK as POINT"+ Arrays.toString(GoggleLocaion));
    }
}
