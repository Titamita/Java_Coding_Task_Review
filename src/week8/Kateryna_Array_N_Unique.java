package week8;

import java.util.Arrays;

public class Kateryna_Array_N_Unique {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(uniqueArray(7)));

    }

    public static int[] uniqueArray(int n) {

        if (n <= 1 || n >= 100) {
            return new int[]{0};
        }

        int[] newArray = new int[n];

        int sum = 0; //-3

        for (int i = 0, j = 1; i < n - 1; i++, j++) {
            newArray[i] = j;
            sum -= j;
        }

        newArray[n - 1] = sum;

        return newArray;

    }

}
