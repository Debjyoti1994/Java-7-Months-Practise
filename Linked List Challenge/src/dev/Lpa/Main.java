package dev.Lpa;

import java.util.*;

public class Main {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Places> town = new LinkedList<>();
        town.add(new Places("Sydney",0));
        town.add(new Places("Adelaide",1374));
        town.add(new Places("Alice Spring",2771));
        town.add(new Places("Brisbane",917));
        town.add(new Places("Darwin",3972));
        town.add(new Places("Melbourne",877));
        town.add(new Places("Perth",3923));


        town.sort(Comparator.comparingInt(Places::distance));
        for (Places myplace:town){
            System.out.println(myplace);
        }
        input(town);


    }
    public static void input(LinkedList<Places>place){
        boolean flag =true;
        ListIterator <Places>myIterator=place.listIterator();
        while (flag){
            output();
            String selection=myScanner.nextLine();
            if (selection.isEmpty()){
                System.out.println("PLeae enter valid input");
                continue;
            }
            char se=selection.toUpperCase().charAt(0);
            System.out.println(se+ " is selected.");
            switch (se){
                case 'Q'->flag=false;
                case 'F'-> {
//                    ListIterator <Places>myIterator=place.listIterator();
                    if (myIterator.hasNext()){
                        System.out.println(myIterator.next());
                    }
                    else {
                        System.out.println("You have reached he end");
                    }

                }
                case 'B'-> {
//                    ListIterator <Places>myIterator=place.listIterator(place.size()-1);
                    if (myIterator.hasPrevious()){
                        System.out.println(myIterator.previous());
                    }
                    else {
                        System.out.println("You have reached at begaining");
                    }

                }
                case 'L'->{
                    for (Places myplace:place){
                        System.out.println(myplace);
                    }
                }

                default -> System.out.println("Enter valid Input");
            }
        }
    }



    public static void output() {
        String text = """
                Available actions(select words or letter)
                (F)orward
                (B)ackard
                (L)List Places
                (M)enue
                (Q)uit""";
        System.out.println(text);
    }


}