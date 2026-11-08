package dev.Lpa;

public class Main {
    public static void main(String[] args) {
Park Yellowstone=new Park("Yellowstone");
Yellowstone.addlocation(44.4882, -110.5916);
System.out.println(Yellowstone.render());
Park GrandCanyon=new Park("Grand Canyon");
GrandCanyon.addlocation(36.0636,-112.1079);
System.out.println(GrandCanyon.render());




    }
}
