package dev.Lpa;

public class Main {
    public static void main(String[] args) {
Park Yellowstone=new Park("Yellowstone");
Yellowstone.addlocation(44.4882, -110.5916);
System.out.println(Yellowstone.render());
Park GrandCanyon=new Park("Grand Canyon");
GrandCanyon.addlocation(36.0636,-112.1079);
System.out.println(GrandCanyon.render());

River missipi=new River("Mississippi");
missipi.addlocation(47.2160, -95.2348);
missipi.addlocation(35.1556, -90.0659);
missipi.addlocation(29.1566, -89.2495);
System.out.println(missipi.render());
//        System.out.println(missipi.printGoogleLcation(missipi.getGoogleLocation()));
        Layer <Mappable>parkLayer=new Layer<>();
        parkLayer.addElements(missipi);
        parkLayer.renderLayer();
        parkLayer.addElements(Yellowstone);
        parkLayer.renderLayer();
//
}
}
