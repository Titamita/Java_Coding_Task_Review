package week3;

public class Kateryna_Negative_Number {

    public static void main(String[] args) {

        System.out.println(reverse_Negative_N(-56784321));

    }

    public static int reverse_Negative_N(int number) {

        if (number >= 0) {
            System.out.println("Number is positive, enter negative number");
        }

        String answerS = "-";
        String n = Integer.toString(number);

        for (int i = n.length()-1; i >= 1 ; i--) {

            answerS += n.charAt(i);

        }

        int answerInt = Integer.parseInt(answerS);

        return answerInt;

    }
}
