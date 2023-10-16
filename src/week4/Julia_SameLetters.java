package week4;

import java.util.Arrays;

public class Julia_SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));

    }

    public static boolean sameLetters(String str1, String str2){

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean sameLetters = Arrays.equals(a1, a2);

        return sameLetters;
    }

}
