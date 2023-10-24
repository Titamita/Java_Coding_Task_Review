package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kateryna_FindUnique {

    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));

        System.out.println(uniqueMap("AAABBBCCCDEF"));

        System.out.println(uniqueWithRemove("AAABBBCCCDEF"));

    }

    public static String unique(String word) {

        String answer = "";

        for (char each : word.toCharArray()) {

            int count = 0;

            for (char each2 : word.toCharArray()) {
                if (each == each2) {
                    count++;
                }
            }

            if (count == 1) {
                answer += "" + each;
            }


        }

        return answer;

    }

    public static String uniqueMap(String word) { //Collections.frequency

//        Map<String, Integer> m = new LinkedHashMap<>();
        String answer = "";

        for (String each : word.split("")) {

            int frequency = Collections.frequency(Arrays.asList(word.split("")), each);

            if (frequency == 1) {
                answer += each;
            }

        }

//        StringBuilder str = new StringBuilder();
//
//        for (String each : m.keySet()) {
//            str.append(each);
//        }

        return answer;

    }

    public static String uniqueWithRemove(String word) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(word.split("")));

        arr.removeIf(p -> word.indexOf(p) != word.lastIndexOf(p));

        String answer = "";

        for (String each : arr) {
            answer += each;
        }

        return answer;

    }

}
