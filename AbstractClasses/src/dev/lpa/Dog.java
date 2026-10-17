package dev.lpa;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
    if (speed.equalsIgnoreCase("slow")){
        System.out.println(getExplicitType()+" is walking.");
    }
    else {
        System.out.println(getExplicitType()+" is running.");
    }
    }

    @Override
    public void makeNoise() {
        if (type.equalsIgnoreCase("wolf")){
            System.out.println("Howling!");

        }
         else {
            System.out.println("woof");
        }

    }
}
