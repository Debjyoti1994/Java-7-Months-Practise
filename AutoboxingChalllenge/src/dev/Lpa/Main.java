package dev.Lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer Shyam=new Customer("shyam",new ArrayList<>(List.of(123.00,900.00,-990.00)));
        Customer Ram=new Customer("Ram",new ArrayList<>(List.of(123.00,900.00,-990.00)));
        System.out.println(Ram);
        System.out.println(Shyam);
        Bank sbi=new Bank("sbi",new ArrayList<>(List.of(Ram,Shyam,new Customer("Sureshh",new ArrayList<>()))));
        System.out.println(sbi);
        sbi.addNewCustomer("taylor");
        System.out.println(sbi);
        sbi.tranaction("Ram",1234.0);
        System.out.println(sbi);
        System.out.println("--".repeat(12));
        sbi.printStatement();

    }
}
