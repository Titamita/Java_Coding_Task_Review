package week6;

public class Julia_Find_Max_Array {

    public static void main(String[] args) {

        int[] nums = {99, 19, 500, 39, -9, 47};

        System.out.println(findMax(nums));

    }

    public static int findMax(int[] arr){

        int max = arr[0]; // set the max for the first index of the array

        for (int i = 1; i < arr.length; i++) { // we start from index 1 since we assigned the zero index to max already

            if(arr[i] > max){ // compares the element of the array with the current max number
                max = arr[i]; // replace the current max number
            }
        }

        return max;
    }
}
