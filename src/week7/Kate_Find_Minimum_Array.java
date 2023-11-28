package week7;

public class Kate_Find_Minimum_Array {

    public static void main(String[] args) {

        int[] numbers ={100,20,500,40,-10,30};

        int min = numbers[0];

        for(int i =1; i<numbers.length; i++){
            if(numbers[i]< min){
                min=numbers[i];
            }
        }
        System.out.println("min "+min);


        System.out.println("findMin(numbers) = " + findMin(numbers));


    }


    public static int findMin(int[] numbers){
        int min1 = numbers[0];
        for(int i =1; i<numbers.length; i++){
            if(numbers[i]< min1){
                min1=numbers[i];
            }
        }
        return min1;
    }


     /*
    Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
     */


}
