package dev.Lpa;

import java.util.ArrayList;
import java.util.ListIterator;

public record Bank(String bankName, ArrayList<Customer> cusRecord) {
    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", cusRecord=" + cusRecord +
                '}';

    }

    public void addNewCustomer(String CsName) {
        var iterate = cusRecord.listIterator();

        while (iterate.hasNext()) {
            if ((iterate.next().CustomerName().equalsIgnoreCase(CsName))) {
                return;
            }
        }
        iterate.add(new Customer(CsName, new ArrayList<>()));

    }
    public void tranaction(String Csname,Double ammount){
        var iterate1=cusRecord.listIterator();
        boolean flag=false;
        while (iterate1.hasNext()){
            Customer customer1=iterate1.next();
            if (( customer1.CustomerName().equalsIgnoreCase(Csname))) {
               customer1.Transaction().add(ammount);
                System.out.println("Match found");
                break;
            }
        }


    }
    public void printStatement(){
        var iterator=cusRecord.listIterator();
        while (iterator.hasNext()){
            Customer myCustomer=iterator.next();
            System.out.println(myCustomer.CustomerName()+" has made a transcation of "+myCustomer.Transaction());
        }
    }


}



