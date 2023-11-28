package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Kate_Remove_Value {

    /*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -225, 981, 102, 87, 99, 1823));

        System.out.println(removeValue(nums));

        System.out.println(removeValue2(nums));

    }



    public static List<Integer> removeValue(List<Integer> nums){

        Iterator<Integer> it =  nums.iterator();

        while (it.hasNext()){

            if(it.next() > 100){
                it.remove();
            }

        }

        return nums;

    }



    public static List<Integer>removeValue2(List<Integer> nums){

        nums.removeIf(p -> p > 100);

        return nums;

    }






}
