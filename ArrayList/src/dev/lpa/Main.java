package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GrocerryItem(String name,String type,int count){
    GrocerryItem(String name) {
        this(name,"Diary",1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s ",count,name.toUpperCase(),type.toUpperCase());
    }
}
public class Main {
    public static void main(String[] args) {

        GrocerryItem[] groceryArray=new GrocerryItem[3];
        groceryArray[0]=new GrocerryItem("milk");
        groceryArray[1]=new GrocerryItem
                ("apples","PRODUCE",6);
        groceryArray[2]=new GrocerryItem("Oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));
        ArrayList objectList=new ArrayList();
        objectList.add(new GrocerryItem("butter"));
        objectList.add("Yogurt");
        ArrayList<GrocerryItem>groceryList=new ArrayList<>();
        groceryList.add(new GrocerryItem("butter"));
        groceryList.add(new GrocerryItem("milk"));
        groceryList.add(new GrocerryItem("oranges","PRODUCE",5));
        groceryList.set(0,new GrocerryItem("apples","PRODUCE",6));
        groceryList.remove(1);
        System.out.println(groceryList);

//        groceryList.add("Yogurt");
//
    }
}
