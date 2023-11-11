package week7;

import java.util.Arrays;

public class Julia_sortAscendingArray {

    public static void main(String[] args) {

        int[] arr = {13, 25, -1, 4, 19, 6};

        System.out.println(Arrays.toString(sortAscending(arr)));

    }

    public static int[] sortAscending(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if(arr[j] > arr[j + 1]){ // current element (arr[j]) is greater than the next element (arr[j + 1]). If true, it means that the elements are in the wrong order and need to be swapped.

                    int tempNum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempNum;
                    ////If the condition is true, this swaps the elements arr[j] and arr[j + 1] using a temporary variable tempNum.
                }
            }
        }
        return arr;
    }
}
