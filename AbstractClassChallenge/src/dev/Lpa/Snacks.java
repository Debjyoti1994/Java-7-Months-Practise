package dev.Lpa;

public class Snacks extends ProductForSale {
    public Snacks(double price, String description) {
        super("Snacks", price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type:" + getType() +
                " |" + "Description: " + getDescription() + " |Price: " + getPrice());
    }


}
