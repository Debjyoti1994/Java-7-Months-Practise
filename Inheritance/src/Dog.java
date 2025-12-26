public class Dog extends Animal {
    private String earShape;
    private String tailShape;


    public Dog() {
        super("mutt", "big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perked", "curled");

    }

    public Dog(String type, double weight,
               String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if (type=="wolf"){
            System.out.println(" Ow Wooo");
        }
    bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk,run and wag their tail.");
        if (speed=="slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("Woof!");
    }

    private void run() {
        System.out.println("Dog Running");
    }

    private void walk() {
        System.out.println("Dog Wallking");
    }private void wagTail() {
        System.out.println("Tail wagging");
    }
}
