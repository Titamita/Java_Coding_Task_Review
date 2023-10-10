package src.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCaracters {
    public static void main(String[] args) {
    /*
        return method find frequency of chars in a string
         */
        String str= "aaabbbbcccqqqqqqq";

        Map<Character, Integer> result = CharFrequency(str);

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.print( " "+ entry.getKey()+  entry.getValue());
        }
    }
    public static Map<Character, Integer> CharFrequency(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();


        for (char ch : input.toCharArray()) {

            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }
        return frequencyMap;
    }
}
