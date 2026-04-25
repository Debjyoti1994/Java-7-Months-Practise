public class main {
    public static void main(String[] args) {
        Animal animal=new Animal("Generic Animal","Huge",700);
        doAnimalStuff(animal,"fast");

        Dog dog=new Dog();
        doAnimalStuff(dog,"slow");

        Dog yorkie=new Dog("Yorkie",15.0);
        doAnimalStuff(yorkie,"fast");

        Dog retriver=new Dog("retriver",34,"pointy","Swimmer");
        doAnimalStuff(retriver,"Slow");

        Dog wolf=new Dog("wolf",89.0);
        doAnimalStuff(wolf,"slow");

        Fish fish=new Fish("Goldie",56,7,9);
        doAnimalStuff(fish,"fast");


    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-------");

    }
}
