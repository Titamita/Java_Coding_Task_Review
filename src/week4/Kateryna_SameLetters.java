package week4;

import java.util.Arrays;

public class Kateryna_SameLetters {

    public static void main(String[] args) {

        System.out.println(same_letters("abc", "cba"));

    }

    public static boolean same_letters(String word1, String word2) {

        char[] w = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        Arrays.sort(w);
        Arrays.sort(w2);

        return Arrays.equals(w, w2);

    }

}
