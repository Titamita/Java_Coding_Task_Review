package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class Kateryna_ConcatTwoArrays {
    public static void main(String[] args) {

        String[] a1 = new String[]{"Hello", "Java", "is", "fun", "and"};
        String[] a2 = new String[]{"we", "use", "it", "everywhere!:)"};

        System.out.println(Arrays.toString(concat2Arrays(a1, a2)));

    }
    public static String[] concat2Arrays(String[] arr1, String[] arr2) {

        String[] answer = new String[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            answer[i] = arr1[i];

        }

        for (int i = arr1.length, j = 0; j < arr2.length; i++, j++) {

            answer[i] = arr2[j];

        }

        return answer;

    }
}
