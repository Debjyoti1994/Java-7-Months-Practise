package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]myArray={1,2,3,4,5};
        System.out.println(Arrays.toString(reverse001(myArray)));

    }
    public static int[] reverse001(int myarray[]){
        int z=myarray.length;
        int temp=0;
        for (int i=0;i<z/2;i++){
            temp=myarray[i];
            myarray[i]=myarray[myarray.length-1-i];
            myarray[myarray.length-1-i]=temp;
        }

        return myarray;
    }
}
