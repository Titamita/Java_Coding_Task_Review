package week6;

public class Kate_FindMaxArray {


    public static void main(String[] args) {

        int[] numbers ={100, 20, 500, 40, -10, 30};

        System.out.println("maxNumber(numbers) = " + maxNumber(numbers));

    }


    public static int maxNumber(int[] nums){
        int max = nums[0]; //if 1st num is max
        for(int i = 0; i<nums.length; i++){ //go through each num of arr

            if(nums[i]>max){ // compare
                max=nums[i];
            }
        }
        return max;

    }

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */


}
