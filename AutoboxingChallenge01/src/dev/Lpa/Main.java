package dev.Lpa;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double>transactions){
    public Customer(String name,double initalDeposit){
        this(name.toUpperCase(),new ArrayList<>(500));
        transactions.add(initalDeposit);
    }
}
public class Main {
    public static void main(String[] args) {
        Customer bob=new Customer("Bob S",1000.0);
        System.out.println(bob);
        Bank bank=new Bank("Chase");
        bank.addNewCustomer("Jane A",500.0);
        System.out.println(bank);
        bank.addTranaction("jane A",-10.255);
        bank.addTranaction("jane A",-70.255);
        bank.printStatement("jane a");
       bank.addNewCustomer("bob s",25);
        bank.addTranaction("Bob S",100);
        bank.printStatement("Bob S");

    }
}
class Bank{
    private String name;
    private ArrayList<Customer>customers=new ArrayList<>(5000);
    public Bank(String name){
        this.name=name;

    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for (var customer:customers){
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n",customerName);
        return null;
    }
    public void addNewCustomer(String customerName,double initalDepost){
        if(getCustomer(customerName)==null){
            Customer customer=new Customer(customerName,initalDepost);
            customers.add(customer);
            System.out.println("New customer added: "+ customer);
        }
    }
    public void addTranaction(String name,double transactionAmount){
        Customer customer=getCustomer(name);
        if (customer!=null){
            customer.transactions().add(transactionAmount);
        }
    }
    public void printStatement(String customerName){
        Customer customer=getCustomer(customerName);
        if(customer==null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer name: "+customer.name());
        System.out.println("Transaction");
        for (double d:customer.transactions()){
            System.out.printf("$%10.2f (%s)%n",d,d<0?"debit":"credit");
        }
    }
}