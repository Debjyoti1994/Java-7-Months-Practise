package dev.Lpa;

public abstract class Point implements Mappable {
    double[] location;
    private String location(){
        return "";
    };

    public Point(double[] location) {
        this.location = location;
    }

    @Override
    public void render() {

    }
}
