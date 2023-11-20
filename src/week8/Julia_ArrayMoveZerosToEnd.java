package week8;

import java.util.Arrays;

public class Julia_ArrayMoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        System.out.println(Arrays.toString(moveZerosToEnd(arr)));


    }

    public static int[] moveZerosToEnd(int[] arr){

        int[] result = new int[arr.length];
        int index = 0;

        for(int each : arr){
            if(each != 0 ){
                result[index++] = each;
            }
        }

        return result;

    }
}
