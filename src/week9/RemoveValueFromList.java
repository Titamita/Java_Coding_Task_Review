package src.week9;

import java.util.ArrayList;
import java.util.List;

public class RemoveValueFromList {
    /*
    2) ArrayList - Remove "Ahmed"
   Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
   Write a java operation to remove all the names named Ahmed

    */
    public static void main(String[] args) {
        int [] arr = {9, 5, 34, 6, 80, 78, 16, -19, 39,-18};
        String[] words ={"Ahmed", "John", "Eric", "Ahmed"};
        System.out.println(removeValue(arr,-18));
        System.out.println(removeValue(words,"Ahmed"));
    }
    public static List<Integer> removeValue(int [] arr, int valueToRemove){   //  version for ints

        List< Integer>  num =new ArrayList<>();
        for (Integer i : arr) {
            if(i != valueToRemove){
                num.add(i);

            }
        }
        return num;
    }
    public static List<String> removeValue(String [] arr, String valueToRemove){  // version for String

        List< String>  words =new ArrayList<>();
        for (String i : arr) {
            if(i != valueToRemove){
                words.add(i);

            }
        }
        return words;
    }
}
