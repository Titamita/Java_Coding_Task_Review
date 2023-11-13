package week7;

import java.util.Arrays;

public class Kateryna_SortDescendingArray {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 1, 22, 32, 18, 2, -19};

        System.out.println(Arrays.toString(arrayDsc(arr)));

    }
    public static int[] arrayDsc(int[] array){

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array.length-1; j++){

                if (array[j] < array[j+1]){

                    int t = array[j];

                    array[j] = array[j+1];
                    array[j+1] = t;

                }

            }

        }
        return array;
    }

}
