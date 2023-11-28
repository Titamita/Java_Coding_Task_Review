package week7;

import java.util.Arrays;

public class Kateryna_FindMinInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 1, -30, 22, 32, 18, 2, -19};

        System.out.println(minArray(arr));
        System.out.println(minArray2(arr));

    }

    public static int minArray(int[] array) {

        int min = array[0];

        for (int each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static int minArray2(int[] array) {

        Arrays.sort(array);
        return array[0];

    }
}

