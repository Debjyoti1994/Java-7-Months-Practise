package dev.Lpa;

public class Grocery extends ProductForSale {
    public Grocery(String s1, double price, String description) {
        super("Grocerry", price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type:Grocerry |"+"Description: "+getDescription()+" |Price: "+getPrice());
    }

}
