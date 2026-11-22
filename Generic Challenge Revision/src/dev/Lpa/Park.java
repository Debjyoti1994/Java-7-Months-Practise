package dev.Lpa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Park extends Point{
    private String name;
    private double[][]GoggleLocaion;



    @Override
    public void render() {
        System.out.println("Render "+name+" as POINT"+GoggleLocaion);
    }
}
