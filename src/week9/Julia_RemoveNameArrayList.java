package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Julia_RemoveNameArrayList {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Kate", "Paul"));
        System.out.println(removeAhmed(names));
        System.out.println(removeAhmed2(names));

    }

    public static List<String> removeAhmed(List<String> names){

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            String each = iterator.next();
            if(each.equalsIgnoreCase("Ahmed")){
                iterator.remove();
            }
        }

        return names;
    }

    public static List<String> removeAhmed2(List<String> list){
        list.removeIf(p -> p.equalsIgnoreCase("Ahmed"));
        return list;
    }
}
