package src.week6;

import java.util.Arrays;

public class dan_sum_of_digits_from_string {
    public static void main(String[] args) {
        String wordWithNums="Abbcc1234dddee5678";
        System.out.println(sumFromString(wordWithNums));
    }
    public static int sumFromString(String str){
        return Arrays.stream(str.split(""))
                .filter(s -> s.matches("\\d"))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
