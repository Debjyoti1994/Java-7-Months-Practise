package dev.Lpa;

import java.util.Arrays;

public abstract class Point implements Mappable {
    double[] location;
    String location(){
        return Arrays.toString(location);
    };

    public Point(double[] location) {
        this.location = location;
    }

    @Override
    public void render() {

    }
}
