package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray=new int[10];
        myIntArray[0]=45;
        myIntArray[1]=1;
        myIntArray[5 ]=50;

        double[] myDoubleArray=new double[10];
        myDoubleArray[2]=3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen={1,2,3,4,5,6,7,8,9,10};
        System.out.println("first ="+firstTen[0]);
        int arrayLength=firstTen.length;
        System.out.println("length of the array ="+arrayLength);
        System.out.println("last ="+firstTen[arrayLength-1]);

        int[] newArray;
        newArray=new int[8];
        for (int i=0;i<newArray.length;i++){
            newArray[i]=newArray[i]+i;
        }
        for (int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
            
        }
        for (int i:newArray){
            System.out.print(i+" ");
        }
        System.out.println("-".repeat(10));
        System.out.println(Arrays.toString(newArray));
        Object objectVariale=newArray;
        if (objectVariale instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }


        Object[] newObject=new Object[3];
        newObject[0]=new StringBuilder("Hello");
        newObject[1]=newArray;
        newObject[2]="New Begaining";

//        newArray= new int[]{5, 4, 3, 2, 1};
//        for (int i=0;i<newArray.length;i++){
//            System.out.print(newArray[i]+" ");
//        }

    }
}
