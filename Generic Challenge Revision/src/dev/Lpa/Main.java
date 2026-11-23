package dev.Lpa;

public class Main {
    public static void main(String[] args) {
        Park grandCanyon=new Park("Grand Canyon",36.0636, -112.1079
        );
        grandCanyon.render();
        River mississippiRiver=new River("Mississippi River",47.2160, -95.2348
        );
        mississippiRiver.addMoreRiverCordinates(35.1556, -90.0659);
        mississippiRiver.addMoreRiverCordinates(29.1566, -89.2495
        );
        mississippiRiver.render();

    }
}
