public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("mutt", "small", 78);
    }

    public Dog(String type, Double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void makeNoise() {
        if (type=="wolf"){
            System.out.print("Ow woo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog walks and wag there tail");
        if (speed=="slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
    }

    private void bark() {
        System.out.println("Woof");
    }

    private void run() {
        System.out.println("Dog running");
    }

    private void wagTail() {
        System.out.println("Dog is wagging tail");
    }

    private void walk() {
        System.out.println("Dog is walking");
    }

}
