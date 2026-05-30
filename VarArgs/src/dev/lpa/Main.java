package dev.lpa;

public class Main {
    public static void main(String...args) {
        System.out.println("Hello World again");
        String[] splitStrings="Hello World again".split(" ");
        printText(splitStrings);
        System.out.println("-".repeat(40));
        printText("Hello");
        System.out.println("-".repeat(40));
        printText("Hello","World","Again");
        System.out.println("-".repeat(40));


        printText();

        String[] slimit={"Hello","nice","to","meet","u"};
        System.out.println(String.join(",",slimit));



    }
    private static void printText(String... textlist){
        for (String t:textlist){
            System.out.println(t);
        }
    }
}
