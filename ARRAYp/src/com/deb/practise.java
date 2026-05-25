package com.deb;

public class practise {
    public static void main(String[] args) {
        int[] myFirstArray;
        myFirstArray=new int[5];
        for (int i=0;i<myFirstArray.length;i++){
            myFirstArray[i]=5-i;
        }
        for (int time:myFirstArray){
            System.out.print(time+" ");
        }
    }
}
