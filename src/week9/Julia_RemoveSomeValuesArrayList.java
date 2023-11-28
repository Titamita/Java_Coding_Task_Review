package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Julia_RemoveSomeValuesArrayList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1000, 50, 1, 3, 110, 599, 14, 21));

        System.out.println(removeMoreThan100(numbers));
        System.out.println(removeValuesOver100(numbers));

    }

    public static List<Integer> removeMoreThan100(List<Integer> numbers){

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            if(iterator.next() > 100){
                iterator.remove();
            }
        }
        return numbers;
    }

    public static List<Integer> removeValuesOver100(List<Integer> numbers){
        numbers.removeIf(p -> p > 100);
        return numbers;
    }
}
