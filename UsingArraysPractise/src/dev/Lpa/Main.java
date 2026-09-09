package dev.Lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] newArray=getRandomArray(10);
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

        int[] secondArray=new int[8];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray=getRandomArray(11);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray=Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));

        int [] smallerArray=Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallerArray));
        int [] largerArray=Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray={"Tony","Steve","Rony","Jacob","Mark"};
        Arrays.sort(sArray);
        if ((Arrays.binarySearch(sArray,"Mark")>=0)){
            System.out.println("Key is found");
        }
        int[]s1={1,2,3,4,5};
        int[]s2={1,2,3,4,5,0};
        if (Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }


//        char[]newCharArray=getRandomArrayChar(7);
//        System.out.println(Arrays.toString(newCharArray));
//        System.out.println ((char)('a'+20));

    }
    public static int[] getRandomArray(int len){
        Random random=new Random();
        int[] randomArray=new int[len];
        for (int i=0;i<len;i++){
            randomArray[i]=random.nextInt(100);
        }
        return randomArray;
    }
    public static char[] getRandomArrayChar(int len){
        char[] randomArray=new char[len];
        Random newRandom=new Random();
        for (int i=0;i<len;i++){
            randomArray[i]=((char)('a'+newRandom.nextInt(26)));
        }
        return randomArray;
    }

}
