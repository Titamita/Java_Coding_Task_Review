package week6;

public class Julia_Sum_Of_Digits_In_String {

    public static void main(String[] args) {

        String str = "aaa123bc456de1";

        System.out.println("Sum of digits in String (aa123bc456de1) is = " + sumOfDigitsInString(str));

    }

    public static int sumOfDigitsInString(String str){

        int sum = 0;

        for(char each : str.toCharArray()){

            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }
        }

        return sum;


    }
}
