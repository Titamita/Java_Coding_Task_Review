package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Julia_findMinArray {

    public static void main(String[] args) {

        int[] arr = {35, -20, 1, -50, 128};

        System.out.println(findMin(arr));

        System.out.println(findMinCollection(arr));

    }

    public static int findMin(int[] arr){

        int min = arr[0];

        for (int each : arr) {
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    public static int findMinCollection(int[] arr){

        List<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }

        return Collections.min(list);


    }
}
