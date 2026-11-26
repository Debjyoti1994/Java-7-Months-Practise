package dev.Lpa;

public class Main {
    public static void main(String[] args) {
        Park mypark=new Park("Yellowstone",Mappable.stringToLatLon("44.4882, -110.5916"));
        mypark.render();

    }

}
