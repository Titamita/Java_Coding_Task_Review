package week4;

import java.util.Arrays;

public class Art_SameLetters {

        public static boolean sameLetters(String str1, String str2) {
            // Check if the lengths of both strings are different
            if (str1.length() != str2.length()) {
                return false;
            }

            // Create character arrays from the strings
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();

            // Sort the character arrays
            Arrays.sort(chars1);
            Arrays.sort(chars2);

            // Compare the sorted arrays
            return Arrays.equals(chars1, chars2);
        }

        public static void main(String[] args) {
            String str1 = "abc";
            String str2 = "cab";
            System.out.println("Are the strings the same? " + sameLetters(str1, str2));

            String str3 = "abc";
            String str4 = "abb";
            System.out.println("Are the strings the same? " + sameLetters(str3, str4));
        }

    }
