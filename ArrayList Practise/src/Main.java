import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>>myArray=new ArrayList<>();
        AddingValues(67.03,89.05,myArray);
        AddingValues(77.00,89.00,myArray);
        AddingValues(27.00,89.00,myArray);
        for (var myarray1:myArray){
            for (var myarray3:myarray1){
                System.out.print(myarray3+" ");
            }
            System.out.println();
        }

    }
    public static void AddingValues(double no1,double no2,ArrayList<ArrayList<Double>>myArray){
        ArrayList<Double>row1=new ArrayList<>(Arrays.asList(no1,no2));
        myArray.add(row1);



    }

}
