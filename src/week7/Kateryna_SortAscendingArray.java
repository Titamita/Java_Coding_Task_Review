package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kateryna_SortAscendingArray {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 1, 22, 32, 18, 2, -19};

        System.out.println(Arrays.toString(arrayAsc(arr)));
        System.out.println(Arrays.toString(arrayAsc2(arr)));

    }

    public static int[] arrayAsc(int[] array) {

        List<Integer> a = new ArrayList<>();

        for (int each : array) {
            a.add(each);
        }

        Collections.sort(a);

        int[] answer = new int[array.length];

        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }

        return answer;

    }

    public static int[] arrayAsc2(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = temp;
                }

            }

        }
        return array;
    }

}
