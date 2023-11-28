package week8;

import java.util.Arrays;

public class Kate_Move_To_Zero {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZeroes(1,0,2,0,3,0,4,0)));


    }


    public static int[] moveZeroes(int... num){

        int [] arrMoved = new int[num.length];
        int index =0;

        for(int each : num){
            if(each !=0 ){
                arrMoved[index++] = each;
            }
        }

        return arrMoved;
    }

     /*
    2- Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */



}
