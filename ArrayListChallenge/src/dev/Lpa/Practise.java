package dev.Lpa;

import java.util.ArrayList;

public class Practise {
    public static void main(String[] args) {
        ArrayList<String>myarray=new ArrayList<>();
        myarray.add("Orange");
        myarray.add("lemon");
        String tree="lemon";
        myarray.remove("Orange");
        myarray.remove(tree);
        System.out.println(myarray);
    }
}
