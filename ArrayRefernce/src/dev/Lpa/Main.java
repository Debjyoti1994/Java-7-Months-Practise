package dev.Lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []myIntArray=new int[5];
        int[]anotherArray=myIntArray;

        System.out.println("myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("AnotherArray= "+ Arrays.toString(anotherArray));

        myIntArray[0]=1;
        modifiedArray(myIntArray);


        System.out.println("after changes myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("after changes AnotherArray= "+ Arrays.toString(anotherArray));
    }
    private static  void modifiedArray(int[] array){
        array[1]=2;
    }
}
