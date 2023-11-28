package week9;

import java.util.Arrays;

public class Kate_Concat_Arr {


    public static void main(String[] args) {

        int[] arr1 = {5, 7, 1};
        int[] arr2 = {4, 13, 8, 3};

        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));

    }


    public static int[] concatArrays(int[] arr1, int[] arr2){


        int[] merged = new int[arr1.length + arr2.length];

        for(int i = 0, y =0; i < merged.length; i++ ){ //this loop will be adding to the merged arr; i -> index for merged arr
            if(i < arr1.length) {
                merged[i] = arr1[i];
            }else{
                merged[i] = arr2[y++]; //only need to update y when adding 2nd array
            }

        }

        return merged;

    }


}
/*

1) Array - Concat two arrays
Write a return method that can concat two arrays

 */





