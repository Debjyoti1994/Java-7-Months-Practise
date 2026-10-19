package dev.Lpa;

public class Grocery extends ProductForSale {
    public Grocery(double price, String description) {
        super("Grocerry", price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type:" + getType() + " |" + "Description: " + getDescription() + " |Price: " + getPrice());

    }


}
