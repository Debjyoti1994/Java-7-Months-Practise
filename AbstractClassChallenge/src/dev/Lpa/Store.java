package dev.Lpa;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<ProductForSale> myProducts =new ArrayList<>();
        myProducts.add(new Grocery(200.0,"Mooing dal"));
        myProducts.add(new Grocery(400.0,"Basmati Rice"));
        myProducts.add(new Grocery(400.0,"Poppy Seeds"));
        myProducts.add(new Snacks(20.00,"Lays"));
        myProducts.add(new Snacks(10.00,"Kurkrae"));
        myProducts.add(new Snacks(50.00,"Pringles"));
        myProducts.add(new Drinks(50.00,"Fruti"));
        myProducts.add(new Drinks(50.00,"Sqash"));
        for(ProductForSale myp:myProducts){
            myp.showDetails();
        }
        System.out.println(".".repeat(12));
        ArrayList<OrderItem>myOrder=new ArrayList<>();
        addItemToOrder(30,new Drinks(50.00,"Fruti"),myOrder);
        addItemToOrder(10,new Grocery(400.0,"Poppy Seeds"),myOrder);
        addItemToOrder(20,new Drinks(50.00,"Fruti"),myOrder);
        printTheOrderedItem(myOrder);

    }
    public static void addItemToOrder(int quantity,ProductForSale productForSale,ArrayList<OrderItem>myOrder){
    myOrder.add(new OrderItem(quantity,productForSale));
    }
    public static void printTheOrderedItem(ArrayList<OrderItem>myOrder){
        for(OrderItem myOrde:myOrder){
            myOrde.getProductForSale().printPrice(myOrde.getQuantity());
            myOrde.getProductForSale().showDetails();
            System.out.println("-".repeat(12));
        }

    }
}
