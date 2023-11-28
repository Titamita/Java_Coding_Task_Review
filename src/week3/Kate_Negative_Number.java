package week3;

public class Kate_Negative_Number {


    public static void main(String[] args) {

        System.out.println(reverseInt(-1234567));
    }

    public static int reverseInt(int n){

        int reverse = 0;

        while(n<0){

            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;

            n/=10;
        }
        return reverse;
    }






}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */
