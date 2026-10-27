package dev.LPa;

import java.util.Scanner;




public class Main {
    public static int n01;
    public static int n02;
    public static void main(String[] args) {
        getTwoNumbers();

        int addition=Calculator.addition(n01,n02);
        System.out.println("Addition :->"+addition);
        double division =Calculator.division(n01,n02);
        System.out.printf("Divison :->%4.2f%n",division);
        //Instant methods
        Calculator myCalc=new Calculator();
        int subtraction=myCalc.substraction(n01,n02);
        System.out.println("Substraction :->"+subtraction);
        int multiplication=myCalc.multiplication(n01,n02);
        System.out.println("Multiplication :->"+multiplication);


    }
    public static void getTwoNumbers(){
        Scanner myScanne=new Scanner(System.in);
        System.out.println("Enter number one");
        n01=myScanne.nextInt();
        System.out.println("Enter number two");
        n02=myScanne.nextInt();
        if(n01<n02){
            int temp=n01;
            n01=n02;
            n02=temp;

        }
        System.out.printf("Number 1:-->%d , Number 2:-->%d%n",n01,n02);




    }
}
