package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal myAnimal = new Animal("animal", "big", 100);
Dog dog=new Dog("wolf","big",100);
dog.makeNoise();
doAnimalStff(dog);

        ArrayList<Animal>myAnimal=new ArrayList<>();
        myAnimal.add(dog);
        myAnimal.add(new Fish("Goldfish","small",46));
        myAnimal.add(new Dog("goldenetriver","small",46));
        myAnimal.add(new Dog("Barcuda","big",46));
        myAnimal.add(new Fish("goldfish","small",46));
        for (Animal myanimal:myAnimal){
            doAnimalStff(myanimal);
        }

    }
 private static void doAnimalStff(Animal animal){
        animal.makeNoise();
        animal.move("Slow");
     System.out.println(".".repeat(12));

 }
}