public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void StartEngine(){

        System.out.println("Starting engine of "+description);

    }
    public  void Car(){
        String instanceType=this.getClass().getSimpleName();
        System.out.println(" This car is of type "+instanceType);
    }
    public void drive(){
        System.out.println("Car has started");

    }
    protected void runEngine(){
        Car();
        StartEngine();
        drive();
        System.out.println("-------------------");

    }
    public static Car getCar(String type,String description){
        return switch (type.toUpperCase().charAt(0)){
            case 'G'->new GasPoweredCar(description);

            default -> new Car(description);
        };

    }
}
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylnder;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylnder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylnder = cylnder;
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
        System.out.println("The gas powered engine has started"+" with "+cylnder);
    }

    @Override
    public void drive() {
        System.out.println("The car is driven at 600 km/hr");
    }
}
class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize=batterySize;
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
        System.out.println("The Hybrid  car engine has started"+" with "+batterySize);
    }

    @Override
    public void drive() {
        System.out.println("The car is driven at averge speed of"+avgKmPerLitre);
    }
}
class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinder;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize,int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinder=cylinder;
    }

    @Override
    public void StartEngine() {
        super.StartEngine();
        System.out.println("The Hybrid car engine has started"+" with  battery size of"+batterySize+" and " +
                " and with cylinder capacity of "+ cylinder);
    }

    @Override
    public void drive() {
        System.out.println("The car is driven at average speed of "+avgKmPerLitre);
    }
}