package dev.Lpa;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<SongPlayList> myPlayList = new LinkedList<>();
        myPlayList.add(new SongPlayList("Man I Need", 210));
        myPlayList.add(new SongPlayList("Rein Me In", 225));
        myPlayList.add(new SongPlayList("Where Is My Husband!", 195));
        myPlayList.add(new SongPlayList("Rain dance", 240));
        myPlayList.add(new SongPlayList("Ordinary", 186));
        myPlayList.add(new SongPlayList("So Easy", 200));
        myPlayList.add(new SongPlayList("Iloveitiloveitiloveit", 183));

        myPlayList.sort(Comparator.comparingInt(SongPlayList::durationSeconds));
        input(myPlayList);

    }

    public static void input(LinkedList<SongPlayList> myPLaylist) {
        boolean flag = true;
        boolean forward =true;
        ListIterator<SongPlayList> myIterator = myPLaylist.listIterator();
        Scanner myscanner = new Scanner(System.in);
        output();

        while (flag) {
            if (!myIterator.hasPrevious()){
                forward=true;
                System.out.println("First Song: "+myIterator.next());
            }
            if (!myIterator.hasNext()){
                forward=false;
                System.out.println("Last Song: "+myIterator.previous());
            }
            System.out.println("Enter input: ");
            String input = myscanner.nextLine().toUpperCase();
            if (input.isEmpty()) {
                System.out.println("Enter valid data");
                continue;
            }
            char select = input.charAt(0);
            switch (select) {
                case 'F' -> {
                    if (!forward){
                        forward=true;
                        if(myIterator.hasNext()){
                            myIterator.next();
                        }
                    }
                    if (myIterator.hasNext()) {
                        System.out.println(myIterator.next());
                    }
                }
                case 'B' -> {
                    if (forward){
                        forward=false;
                        if(myIterator.hasPrevious()){
                            myIterator.previous();
                        }
                    }
                    if (myIterator.hasPrevious()) {
                        System.out.println(myIterator.previous());
                    }
                }
                case 'L' -> {
                    for (SongPlayList play : myPLaylist) {
                        System.out.println(play);
                    }
                }
                case 'M' -> output();
                case 'Q' -> flag = false;


            }
        }


    }

    public static void output() {
        String text = """
                PLease enter one of the menue
                (F)orwards
                (B)ackwards
                (L)ist all Songs
                (M)Show Menue again
                (Q)uit""";
        System.out.println(text);
    }
}
