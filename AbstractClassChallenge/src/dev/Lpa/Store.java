package dev.Lpa;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<ProductForSale> myProducts =new ArrayList<>();
        myProducts.add(new Grocery(200.0,"Grocerry goods1"));
        myProducts.add(new Grocery(300.0,"Grocerry goods2"));
        myProducts.add(new Grocery(400.0,"Grocerry goods3"));

        for(ProductForSale myp:myProducts){
            myp.showDetails();
        }


    }
}
