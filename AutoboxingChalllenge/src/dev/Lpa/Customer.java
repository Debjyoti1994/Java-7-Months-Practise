package dev.Lpa;

import java.util.ArrayList;

public record Customer(String CustomerName, ArrayList<Double> transaction) {
    public Customer(String name,double initialDeposit){
        this(name.toUpperCase(),new ArrayList<>(500));
        transaction.add(initialDeposit);
    };

    @Override
    public String toString() {
        return "" +
                "CustomerName=" + CustomerName + "" +
                ", Transaction=" + transaction +
                "";
    }
}
