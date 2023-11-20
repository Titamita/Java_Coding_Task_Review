package week8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Julia_Array_N_Unique_Integers {

    public static void main(String[] args) {

        int n = 4;
        int[] result = uniqueIntegerArray(n);
        System.out.println(Arrays.toString(result));

    }

    public static int[] uniqueIntegerArray(int n){

        if(n <= 1 || n >= 100){
            System.out.println("N should be between 1 and 99");
        }

        int[] newArray = new int[n];

        Set<Integer> uniqueNumbers = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            uniqueNumbers.add(i);
        }

        for(int each : uniqueNumbers){
            newArray[each] = each + 1;
            sum += newArray[each];
        }

        newArray[n-1] = -sum;

        return newArray;
    }
}
