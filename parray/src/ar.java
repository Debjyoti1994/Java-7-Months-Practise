import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ar {
    public static void main(String[] args) {
        int []nums1={1,2};
        int []nums2={4,3};

        ArrayList<Integer> mergedArray=new ArrayList<>();
        for (int z:nums1){
            mergedArray.add(z);
        }
        for (int z:nums2){
            mergedArray.add(z);
        }
        mergedArray.sort(Comparator.naturalOrder());
        System.out.println(mergedArray);
        int element=0;
        int size=nums1.length+nums2.length;
        element=(size/2);
        System.out.println("Element= "+element);
        if((size%2)!=0){
            System.out.println("Its odd");
            System.out.println(""+ (mergedArray.get(element)));
        }
        else{

            System.out.println(""+ (mergedArray.get(element-1)+mergedArray.get(element))*0.5);
        }


    }
}
