package dev.Lpa;

public class Main {
    public static void main(String[] args) {
        Park mypark=new Park("Yellowstone",Mappable.stringToLatLon("44.4882, -110.5916"));
        mypark.render();
        River myRiver=new River("Mississippi",new double[][]{
                {47.2160, -95.2348},
                {35.1556, -90.0659},
                {47.2160, -95.2348},
                {35.1556, -90.0659},
                {29.1566, -89.2495},
        });
        myRiver.render();

    }

}
