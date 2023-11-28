package src.week3;

public class ElenaReverseNegativeNumber {
    public static int reverseNegativeNumber(int num){
        if(num >= 0){
            return num;
        }else{
            return -num;
        }
    }

    public static void main(String[] args) {
        int negativeNumber = -12345;
        int reversed = reverseNegativeNumber(negativeNumber);

        System.out.println(negativeNumber);
        System.out.println(reversed);
    }
}
