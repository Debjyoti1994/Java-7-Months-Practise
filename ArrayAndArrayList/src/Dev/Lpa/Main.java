package Dev.Lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] array={"First","second","Third"};
        var OrignalList = Arrays.asList(array);
        OrignalList.set(0,"One");
        System.out.println("OrignalList: "+ OrignalList);
        System.out.println("Array: "+Arrays.toString(array));

        OrignalList.sort(Comparator.naturalOrder());
        System.out.println("Array: "+Arrays.toString(array));

//        OrignalList.add("Four");
        List<String>newList=Arrays.asList("First","Secoond","Third");
        System.out.println(newList);

        String[]name=newList.toArray(new String[newList.size()]);
        System.out.println(Arrays.toString(name));



    }
}
