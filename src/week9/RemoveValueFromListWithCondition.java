package src.week9;

import java.util.ArrayList;
import java.util.List;

public class RemoveValueFromListWithCondition {
    /*
    3) ArrayList - Remove some values 
     Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    */
    public static void main(String[] args) {
        int [] arr = {9, 5, 34, 6, 80, 78, 16, -19, 39,-18};
        System.out.println(removeValueGreaterThan(50,arr));
    }

    public static List<Integer> removeValueGreaterThan(int maxValue, int[] arr ){
        List< Integer> num =new ArrayList<>();

        for (Integer i : arr) {
            if(i<maxValue ){
                num.add(i);
            }
        }
        return num;
    }
}
