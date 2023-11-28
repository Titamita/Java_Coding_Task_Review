package week6;

public class Kate_Sum_Of_Digits_In_String {

    public static void main(String[] args) {

        String str = "a1b2c3d4e5";

        int sum =0;

        for(char each : str.toCharArray()){

            if(Character.isDigit(each)){
                sum+= Integer.parseInt(""+each); //if character is digit --> convert to number
            }
        }
        System.out.println(sum);


        System.out.println("sumOfDigitsInString(\"a1b2c3d4e5\") = " + sumOfDigitsInString("a1b2c3d4e5"));

    }


    public static int sumOfDigitsInString(String str){

        int sum =0;

        for(char each : str.toCharArray()){

            if(Character.isDigit(each)){
                sum+= Integer.parseInt(""+each); //if character is digit --> convert to number
            }
        }
        return sum;
    }

}
