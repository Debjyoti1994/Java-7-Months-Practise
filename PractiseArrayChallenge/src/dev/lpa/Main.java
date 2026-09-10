package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] newArray = generateArray(5);
        System.out.println(Arrays.toString(newArray));
        int[] sortedArray = decreasingArray(newArray);
//        System.out.println(Arrays.toString(sortedArray));
    }


    public static int[] decreasingArray(int[] unsortedArray) {
//        for (int j = 0; j <unsortedArray.length ; j++) {
//            for (int i = 0; i < unsortedArray.length-1; i++) {
//                if (unsortedArray[i] < unsortedArray[i + 1]) {
//                    int z = unsortedArray[i];
//                    unsortedArray[i]=unsortedArray[i+1];
//                    unsortedArray[i+1]=z;
//                }
//            }
//        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] < unsortedArray[i + 1]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    System.out.println("--->"+Arrays.toString(unsortedArray));
                    flag=true;
                }
            }
        }
        System.out.println("-->"+Arrays.toString(unsortedArray));
        return unsortedArray;
    }

    public static int[] generateArray(int len) {
        int[] randomArray = new int[len];
        Random number = new Random();
        for (int i = 0; i < len; i++) {
            randomArray[i] = number.nextInt(100);
        }
        return randomArray;
    }
}
