package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] firstArray=getRandomArray(10);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[]secondArray=new int[9];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));
        int[]thirdArray=getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int []fourthArray=Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));

        int[] smallerArray=Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallerArray));

        int[] LargerArray=Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(LargerArray));

        String[] sArray={"Able","Jane","Mark","Ralphh","Davide"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Mark")>0){
            System.out.println("Found mark in the list");
        }
        else{
            System.out.println("Not found");
        }
        int[]s1={1,3,6,9};
        int[]s2={1,3,6,9,8};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays aren't equal");
        }






    }
    private static int[]getRandomArray(int len){
        Random random =new Random();
        int[] newInt=new int[len];
        for (int i=0;i<len;i++){
            newInt[i]=random.nextInt(100);
        }

        return newInt;
    }
}
