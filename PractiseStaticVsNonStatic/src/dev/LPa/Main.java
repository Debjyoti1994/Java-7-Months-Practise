package dev.LPa;

public class Main {
    public static void main(String[] args) {
        int addition=Calculator.addition(2,5);
        System.out.println("Addition :->"+addition);
        double division =Calculator.division(3,6);
        System.out.println("Divison :->"+division);
        //Instant methods
        Calculator myCalc=new Calculator();
        int sustraction=myCalc.substraction(8,2);
        System.out.println("Substraction :->"+sustraction);
        int multiplication=myCalc.multiplication(8,2);
        System.out.println("Multiplication :->"+multiplication);




    }
}
