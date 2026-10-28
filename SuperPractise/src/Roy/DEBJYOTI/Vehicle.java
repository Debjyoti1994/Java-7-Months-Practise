package Roy.DEBJYOTI;

public class Vehicle {
    private String brandName;
    protected Double StartingPrice ;

    public Vehicle(String brandName, Double startingPrice) {
        this.brandName = brandName;
        StartingPrice = startingPrice;
    }
    public void description(){
        System.out.printf("This is a vehicle of brand %s and starting price is %.2f . %n",brandName,StartingPrice);

    }
}
class Car extends Vehicle{
    private String modelName;
    private int capacity;


    public Car(String brandName, Double startingPrice, String modelName) {
        super(brandName, startingPrice);
        this.modelName = modelName;
        this.capacity = 4;
    }

    @Override
    public void description() {
        super.description();
        super.StartingPrice=700.00;
        System.out.println("Model Name :"+modelName+" and"+" capacity of "+capacity);
        System.out.println("New starting price "+StartingPrice);
    }
}
