public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "huge", 400);
        doAnimalStuff(animal, "slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever=new Dog("Labrador Retriever",65,"floppy",
                "swimmer");
        doAnimalStuff(retriever,"slow");
        Dog wolf=new Dog("wolf",40);
        doAnimalStuff(wolf,"slow");
        fish goldie=new fish("goldie",0.2,2,4);
        doAnimalStuff(goldie,"fast");
    }


    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ _ _ _ _ _");
    }
}
