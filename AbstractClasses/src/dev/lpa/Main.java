package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animals = new Animal("animal", "big", 100);
Dog dog=new Dog("wolf","big",100);
dog.makeNoise();
doAnimalStuff(dog);

        ArrayList<Animal>animals=new ArrayList<>();
        animals.add(dog);
        animals.add(new Fish("Goldfish","small",46));
        animals.add(new Dog("goldenetriver","small",46));
        animals.add(new Dog("Barcuda","big",46));
        animals.add(new Fish("goldfish","small",46));
        animals.add(new Horse("Clydesdale","small",20.));
        for (Animal animal:animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentMamal){
                currentMamal.shedHair();

            }
            System.out.println(".".repeat(12));
        }

    }
 private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("Slow");


 }
}