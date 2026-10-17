package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animals = new Animal("animal", "big", 100);
Dog dog=new Dog("wolf","big",100);
dog.makeNoise();
doAnimalStff(dog);

        ArrayList<Animal>animals=new ArrayList<>();
        animals.add(dog);
        animals.add(new Fish("Goldfish","small",46));
        animals.add(new Dog("goldenetriver","small",46));
        animals.add(new Dog("Barcuda","big",46));
        animals.add(new Fish("goldfish","small",46));
        for (Animal animal:animals){
            doAnimalStff(animal);
        }

    }
 private static void doAnimalStff(Animal animal){
        animal.makeNoise();
        animal.move("Slow");
     System.out.println(".".repeat(12));

 }
}