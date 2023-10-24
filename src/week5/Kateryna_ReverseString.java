package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kateryna_ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
        System.out.println(reverse("Mountains"));
        System.out.println(reverseStringBuilder("Hello World"));
    }

    public static String reverseString(String word) {

        String answer = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            answer += word.charAt(i);
        }

        return answer;
    }

    public static String reverse(String word) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(word.split("")));

        Collections.reverse(arr);

//        StringBuilder str = new StringBuilder();
//        for (String each : arr) {
//            str.append(each);
//        }
//        return String.valueOf(str);

        String str = "";
        for (String each : arr) {
            str += each;
        }

        return str;

    }

    public static String reverseStringBuilder(String word) {

        return String.valueOf(new StringBuilder(word).reverse());

    }


}
