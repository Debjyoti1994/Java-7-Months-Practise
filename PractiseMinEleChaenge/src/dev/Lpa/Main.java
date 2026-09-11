package dev.Lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] z=readIntegers();
        System.out.println(Arrays.toString(z));
//        System.out.println("Min element of Array is "+findMin(z));
        System.out.println("After reversal of array-->>");
        System.out.println(Arrays.toString(reverseArrayCopy(z)));


    }
    private static int[]readIntegers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Integers separated by commas");
        String input=scanner.nextLine();
        String[] k=input.split(",");
        int[]values=new int[k.length];
        for (int i=0;i< k.length;i++){
            values[i]=Integer.parseInt(k[i].trim());

        }
        return values;
    }

    private static int[] readIntegers1(){
        System.out.println("Enter total number off elements in a Arrray");
        Scanner newInput=new Scanner(System.in);
        int n=newInput.nextInt();

        int[] myarray=new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Enter element Number "+(int)(i+1)+":");
            myarray[i]=newInput.nextInt();


        }
        return myarray;
    }
    private static int findMin(int[] myArray){
        int z=Integer.MAX_VALUE;
        for (int i :myArray) {
            if(z>i)
                z=i;

        }
        return z;
    }
    private static int[] reverseArray(int[]myarray){
        int n=myarray.length;
        int temp;

        for (int i = 0; i <n/2 ; i++) {
            temp=myarray[i];
            myarray[i]=myarray[myarray.length-i-1];
            myarray[myarray.length-i-1]=temp;

        }
        return myarray;
    }
    private static int[]reverseArrayCopy(int[]myArray){
        int[]myreverseArray=new int[myArray.length];
        int n=myArray.length-1;
        for(int z:myArray){
            myreverseArray[n--]=z;
        }
        return myreverseArray;
    }
}
