package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "banana", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> grocerry = new ArrayList<>(list);
        grocerry.add("yogurt");
        System.out.println(grocerry);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
        grocerry.addAll(nextList);
        System.out.println(grocerry);
        System.out.println("Third item =" + grocerry.get(2));
        if (grocerry.contains("mustard")) {
            System.out.println("The object has been found");
        }
        grocerry.add("yogurt");
        System.out.println("first ="+grocerry.indexOf("yogurt"));
        System.out.println("last ="+grocerry.lastIndexOf("yogurt"));

        System.out.println(grocerry);
        grocerry.remove(1);
        System.out.println(grocerry);
    grocerry.remove("yogurt");
        System.out.println(grocerry);
        System.out.println("-".repeat(15));

        grocerry.removeAll(List.of("apples","eggs"));
        System.out.println(grocerry);
        grocerry.retainAll(List.of("apples","milk","mustard","Chesse"));
        System.out.println(grocerry);
        grocerry.clear();
        System.out.println(grocerry);
        System.out.println("isEmpty ="+grocerry.isEmpty());
        System.out.println("Empty List"+nextList);

        System.out.println("-".repeat(14));

        grocerry.addAll(List.of("apples","milk","mustard","cheese"));
        grocerry.addAll(Arrays.asList("eggs","hamm","mustard","pickles"));

        System.out.println(grocerry);
        grocerry.sort(Comparator.naturalOrder());
        System.out.println(grocerry);
        grocerry.sort(Comparator.reverseOrder());
        System.out.println(grocerry);

        var groceryArray=grocerry.toArray(new String[grocerry.size()]);
        System.out.println(Arrays.toString(groceryArray));





    }
}
