package dev.Lpa;

import java.util.Arrays;

public abstract class Line implements Mappable {
    double[][] location;
    String location(){
        return Arrays.deepToString(location);
    };

    public Line(double[][] location) {
        this.location = location;
    }

    @Override
    public void render() {

    }
}
