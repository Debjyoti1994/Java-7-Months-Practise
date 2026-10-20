package dev.Lpa;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale>storeProducts=new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil painting",1350.00,"Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture",200.00,"Bronze work by JFK,produced in 1950"));
        listPrducts();

    }
    public static void listPrducts(){
        for (var item:storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}
