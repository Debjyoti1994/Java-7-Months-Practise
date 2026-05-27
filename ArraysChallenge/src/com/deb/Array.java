package com.deb;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int []unsortedArray=randomArray(4);
        System.out.println(Arrays.toString(unsortedArray));
        sortedDecArray(unsortedArray);

        int[] sortedArray=sortIntegers(new int[] {7,30,35});
        System.out.println(Arrays.toString(sortedArray));

//        Arrays.sort(unsortedArray);
//        System.out.println(Arrays.toString(unsortedArray));
//        int []decSort=new int[unsortedArray.length];
//        for (int i=0;i<unsortedArray.length;i++){
//            decSort[i]=unsortedArray[unsortedArray.length-1-i];
//
//        }
//        System.out.println(Arrays.toString(decSort));


    }
    public static int[] randomArray(int len){
        Random random=new Random();
        int[] newArray=new int[len];
        for (int i=0;i<len;i++){
            newArray[i]=random.nextInt(100);
        }
        return newArray;
    }
    public static int[]sortedDecArray(int array1[]){
        int array2[]=array1;
        boolean flag =true;
        int left ,right,temp;
        for(int j=0;j<array2.length-1;j++){
        for (int i=0;i<array2.length-1;i++){
            flag=false;
            if(array2[i]<array2[i+1]){
                temp=array2[i];
                array2[i]=array2[i+1];
                array2[i+1]=temp;

            }
            System.out.println("Iteration "+i+"-->"+Arrays.toString(array2));

        }
            System.out.println("--".repeat(10));
        flag=true;
        }

        return array2;
    }
    public static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray=Arrays.copyOf(array,array.length);
        boolean flag=true;
        int temp;
        while (flag){
            flag=false;
            for (int i=0;i<sortedArray.length-1;i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                    System.out.println("----->"+Arrays.toString(sortedArray));

                }
            }
            System.out.println("--->"+Arrays.toString(sortedArray));

        }
        return sortedArray;
    }
}
