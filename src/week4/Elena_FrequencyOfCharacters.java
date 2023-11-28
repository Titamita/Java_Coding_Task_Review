package src.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Elena_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBCDDDDEE";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
            map.put(each.charAt(0),frequency);
        }
        System.out.println(map);
    }

}
