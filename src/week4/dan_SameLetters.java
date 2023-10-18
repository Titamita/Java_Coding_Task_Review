package src.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class dan_SameLetters {

    public static void main(String[] args) {
    String one = "aaaabbbccddess";
    String two = "abcdes";
        System.out.println(sameLetters(one,two));
    }
    public static boolean sameLetters(String str,String str1) {
        Set<String> uniqFromStr = new HashSet<>(Arrays.asList(str.split("")));
        Set<String> uniqFromStr1=new HashSet<>(Arrays.asList(str1.split("")));


        return uniqFromStr.containsAll(uniqFromStr1) && uniqFromStr1.containsAll(uniqFromStr);
    }
}
