package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class Kateryna_RemoveValue {

    public static void main(String[] args) {

        ArrayList<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 5, 10, 123, 560, 432, -45, 430, 567, 93));
        removeCondition(listOfIntegers);
    }

    public static void removeCondition(ArrayList<Integer> numbers){

        numbers.removeIf(p -> p > 100);

        System.out.println(numbers);

    }

}
