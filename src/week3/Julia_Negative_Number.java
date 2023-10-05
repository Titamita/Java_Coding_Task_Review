package week3;

public class Julia_Negative_Number {

    public static void main(String[] args) {

        int negativeNum = -12345;
        int reversedNum = reverseNegative(negativeNum);
        System.out.println("Original Number: " + negativeNum);
        System.out.println("Reversed Number: " + reversedNum);

    }

    public static int reverseNegative(int num) {

        if (num < 0) {

            num = -num; // convert it to a positive number

            int reversedNumber = 0; // we are starting out at 0

            while (num > 0) {
                int lastDigit = num % 10; // this gives us the last digit of current num
                reversedNumber = reversedNumber * 10 + lastDigit; // takes existing reversed number * 10 (shifting digits one position to the left) and then adds the lastDigit value to it.
                num /= 10; // moves to the next digit of the original number.
            }
            return -reversedNumber;
        }
        return num;
    }
}
