package week6;

public class Kateryna_SumOfDigits_InString {

    public static void main(String[] args) {

        String word = "145689";
        System.out.println(sumOfDigits(word));

    }

    public static int sumOfDigits(String word) {

        int sum = 0;

        for (char each : word.toCharArray()){

            sum += Integer.parseInt("" + each);

        }

        return sum;
    }

}
