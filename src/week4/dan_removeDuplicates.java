package src.week4;

import java.util.*;

public class dan_removeDuplicates {
    public static void main(String[] args) {
        String str ="aaaassssdddddqqqqwweeee";
        System.out.println(removeDuplicate(str));
    }
    public static String removeDuplicate(String str){
        String out="";
        for(String each :str.split("")){
            if (!out.contains(each)){
                out+=each;
            }
        }
        return out;
    }
}
