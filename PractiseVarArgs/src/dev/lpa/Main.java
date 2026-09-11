package dev.lpa;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World Again");
        String[] splitString="Hello World Again".split(" ");
        printText(splitString);
        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello","World","Again");

        System.out.println("_".repeat(20));
        printText("First");

        String[] join={"First","Second","Third"};
        System.out.println(String.join(",",join));



    }
    private static  void printText(String... textList){
        for(String t:textList){
            System.out.println(t);
        }
    }
}
