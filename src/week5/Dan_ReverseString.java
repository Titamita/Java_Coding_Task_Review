package src.week5;

import java.util.Arrays;
import java.util.Stack;

public class Dan_ReverseString {
    public static void main(String[] args) {
        String original ="abcdefg";
        System.out.println(reverse(original));

    }
    //this method will reverse original string and return a new string with reversed form .
    public static String reverse(String s){

        Stack<String> word =new Stack<>();
        StringBuilder reversed =new StringBuilder();
        for(Object each : Arrays.stream(s.split("")).toArray()){
            word.push(each.toString());
            reversed.append(each);
        }
        return reversed.toString();

    }
}
