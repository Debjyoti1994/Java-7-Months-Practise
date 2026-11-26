package dev.Lpa;

import java.util.Arrays;

public class Park extends Point{
     private String name;



    public Park(String name,double[] location) {
        super(location);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.printf("RENDER %s PARK as %s (%s)",name,"POINT", Arrays.toString(location));
    }
}
