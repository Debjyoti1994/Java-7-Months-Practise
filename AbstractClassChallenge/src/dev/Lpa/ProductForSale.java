package dev.Lpa;

public abstract class  ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public double getSalesPrice(int quantity){
        return quantity*price;
    }
    public void printPrice(int quantity){
        System.out.println("Quantity: "+quantity+" |"+type+" |Total price: "+
                "₹"+getSalesPrice(quantity));
    }
    public abstract void showDetails();
}
