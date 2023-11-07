package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kateryna_Find_Max_Array {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 45, -9, 12, 56};
        maxFromArray(arr);

        int[] arr2 = new int[]{1, 3, 45, -9, 12, 56};
        System.out.println(maxWithCollection(arr2));


    }
    public static void maxFromArray(int[] array){

        int max = array[0];

        for (int each : array){
            if (each > max){
                max = each;
            }
        }

        System.out.println(max);

    }

    public static int maxWithCollection(int[] array){

        List<Integer> a = new ArrayList<>();

        for (int each : array){
            a.add(each);
        }

        return Collections.max(a);

    }
}
