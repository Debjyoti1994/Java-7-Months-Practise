package dev.Lpa;

public abstract class Line implements Mappable {
    double[][] location;
    private String location(){
        return "";
    };

    public Line(double[][] location) {
        this.location = location;
    }

    @Override
    public void render() {

    }
}
