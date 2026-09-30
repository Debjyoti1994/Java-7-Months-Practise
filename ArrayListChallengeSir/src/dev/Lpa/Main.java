package dev.Lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> grocerries = new ArrayList<>();

        while (flag) {
            printAction();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(grocerries);
                case 2 -> removeItems(grocerries);
                default -> flag = false;
            }
            grocerries.sort(Comparator.naturalOrder());
            System.out.println(grocerries);
        }


    }

    private static void addItems(ArrayList<String> grocerries) {
        System.out.println("Add item(s)[separated by comma]:");
        String[] items = scanner.nextLine().split(",");
//        grocerries.addAll(List.of(items));
        for (String i : items) {
        String trimmed=i.trim();
        if(grocerries.indexOf(trimmed)<0){
            grocerries.add(trimmed);
        }

        }

    }
    private static void removeItems(ArrayList<String> grocerries) {
        System.out.println("Remove item(s)[separated by comma]:");
        String[] items = scanner.nextLine().split(",");
//        grocerries.addAll(List.of(items));
        for (String i : items) {
            String trimmed=i.trim();
            grocerries.remove(trimmed);


        }

    }

    public static void printAction() {
        String textBlock = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:
                """;
        System.out.println(textBlock);
    }
}
