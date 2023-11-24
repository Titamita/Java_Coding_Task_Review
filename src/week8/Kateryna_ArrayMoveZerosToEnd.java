package week8;

import java.util.Arrays;

public class Kateryna_ArrayMoveZerosToEnd {

    public static void main(String[] args) {

        int[] array = new int[]{1, 0, 2, 0, 3, 0, 4, 0};

        zeroToEnd(array);


    }

    public static void zeroToEnd(int[] array) {

        int[] answer = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++) {

            if (array[i] != 0) {
                answer[j++] = array[i];
            }

        }

        System.out.println(Arrays.toString(answer));

    }

}
