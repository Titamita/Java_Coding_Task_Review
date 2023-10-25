package src.week6;

public class dan_Find_Max_Int_Array {

    public static void main(String[] args) {
        int [] nums ={1,10,6,9,8,4,3,2,5};
        System.out.println(maxOfArray(nums));
    }
    public static int maxOfArray(int [] nums){

        int maxim=Integer.MIN_VALUE;
        for(int i =0;i<nums.length-1;i++){
            maxim =Integer.max(maxim,nums[i]);
        }

        return maxim;
    }
}
