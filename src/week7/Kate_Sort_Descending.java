package week7;

import java.util.Arrays;

public class Kate_Sort_Descending {



    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        int[] descendArr = sortDescending(arr);
        System.out.println(Arrays.toString(descendArr));
    }


    public static int[] sortDescending(int[] arr){

        for(int i = 0; i< arr.length;i++){
            for(int j =0; j>arr.length-1; j++){
                int descend =0;
                if(arr[i]<arr[j+1]){
                    descend = arr[i];
                    arr[j]=arr[j+1];
                    //arr[j]=descend;
                }
            }
        }
        return arr;

    }

    /*
    Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */


}
