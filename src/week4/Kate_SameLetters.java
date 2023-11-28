package week4;

import java.util.Arrays;

public class Kate_SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "kab")); //false
        System.out.println(sameLetters("rty", "ytr")); //true

    }


    public static boolean sameLetters(String str1, String str2){

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return  Arrays.equals(arr1,arr2) ? true : false;

    }





}
