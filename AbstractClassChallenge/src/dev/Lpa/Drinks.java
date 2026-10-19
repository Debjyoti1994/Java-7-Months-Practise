package dev.Lpa;

public class Drinks extends ProductForSale {
    public Drinks(double price, String description) {
        super("Drinks", price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type:" + getType() + " |" + "Description: " + getDescription() + " |Price: " + getPrice());
    }


}
