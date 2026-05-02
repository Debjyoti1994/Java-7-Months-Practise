public class Main {
    public static void main(String[] args) {
        Car RollsRoyce=new Car("Rolls Royce");
        RollsRoyce.runEngine();
        Car Phantom=Car.getCar("G","Phantom");
        Phantom.runEngine();
        Car bmw=new HybridCar("Hybrid",67.00,900,7);
        bmw.runEngine();
    }
}
