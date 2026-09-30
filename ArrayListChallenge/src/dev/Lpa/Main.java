package dev.Lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        boolean flag = true;
        ArrayList<String> myList = new ArrayList<>();

        while (flag) {
            System.out.println("Enter--> O to quit\nEnter--> 1 to add Items\nEnter--> 2 to remove Items");
            int selection = newInput.nextInt();
            newInput.nextLine();
            System.out.println(selection);
            if (selection == 0) {
                flag = false;
                System.out.println("Closing the list");
            } else if (selection == 1) {
                System.out.println("Enter item u want  to add to list");
                String data = newInput.nextLine();
                myList = myList1(selection, data, myList);
                System.out.println(myList);


            } else if (selection == 2) {
                System.out.println("Enter items u want to delete from  the list");
                String data = newInput.nextLine();
                System.out.println("Data==" + data);
                myList = myList1(selection, data, myList);
                System.out.println(myList);


            }
            else {
                System.out.println("Enter valid selection");
            }

        }
    }

    public static ArrayList<String> myList1(int number, String item, ArrayList<String> newTwo) {
        ArrayList<String> newList = newTwo;


        String[] newtemp = item.split(",");
        for (int i = 0; i < newtemp.length; i++) {
            String element = newtemp[i].trim();
            if (number == 1) {
                if (!(newList.contains(element))) {
                    newList.add(element);

                }
            }
            if (number == 2 || number == -2) {
                System.out.println("Enters the loop1");
                if (newList.contains(element)) {
                    System.out.println("Enters the loop");
                    newList.remove(element);
                    System.out.println(newList);
                    System.out.println("-".repeat(6));

                }

            }

        }


        newList.sort(Comparator.naturalOrder());
//        System.out.println(newList);
        return newList;
}
}
