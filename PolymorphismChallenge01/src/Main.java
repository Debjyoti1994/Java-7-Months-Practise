public class Main {
    public static void main(String[] args) {
    Car car=new Car("2022 Blue Ferrari 296 GTS");
    runRace(car);
    Car ferrari=new GasPoweredCar("2022 Blue Ferrari 296 GTS",
            15.4,6);
    runRace(ferrari);
    Car tesla=new ElectricCar("2022 Red Tesla Model 3",
            568,75);
    runRace(tesla);
    Car hybridFerrari=new HybridCar("Ferrari hybrid 2027",45,8,6);
    runRace(hybridFerrari);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
        System.out.println("----------");

    }
}
