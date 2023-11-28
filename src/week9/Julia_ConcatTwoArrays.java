package week9;

import java.util.Arrays;

public class Julia_ConcatTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {3, 7, 22, 14};
        int[] arr2 = {4, 8, 21, 13};

        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));


    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2){

        int[] newArray = new int[arr1.length + arr2.length];

        int k = 0; // index numbers of 3rd array

        for (int i = 0; i < arr1.length; i++, k++) {
            newArray[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            newArray[k] = arr2[i];
        }

        return newArray;

    }

    public static int[] concatArrays(int[] arr1, int[] arr2){

        int[] newArray = new int[arr1.length + arr2.length];

        for (int i = 0, y = 0; i < newArray.length; i++) {

            if(i < arr1.length){
                newArray[i] = arr1[i];
            }else{
                newArray[i] = arr2[y++];
            }
        }

        return newArray;

    }
}
