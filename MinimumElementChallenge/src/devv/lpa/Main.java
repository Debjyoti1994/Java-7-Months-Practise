package devv.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array=readIntegers();
        System.out.println(Arrays.toString(array));
//        System.out.println("The min value is :"+minimumValue(array));
        System.out.println("Reverse array"+Arrays.toString(reverseArray(array)));
        System.out.println("Original array"+Arrays.toString(array));

    }
    public static int[] readIntegers(){
        Scanner newT=new Scanner(System.in);
        System.out.println("Enter elements of array");
        String arrayElements=newT.nextLine();
        String[] s2=arrayElements.split(",");



        int[] array=new int[s2.length];
        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(s2[i].trim() );
        }
        return array;
    }
    private static int minimumValue(int[] myArray){
        int minValue=Integer.MAX_VALUE;
        for (int i:myArray){
            if (minValue>i){
                minValue=i;
            }

        }
        return minValue;
    }
    private static int[] reverseArray(int[]array){
        int z=array.length-1;
        int[] reverseArray=new int[z+1];
        for (int el:array){
            reverseArray[z--]=el;
        }


        return reverseArray;
    }
}
