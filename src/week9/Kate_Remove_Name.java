package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Kate_Remove_Name {

    public static void main(String[] args) {

        //ArrayList of names

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println(removeName(names));

        System.out.println(removeName2(names));


    }



    public static List<String> removeName(List<String>names){

        Iterator<String> iterator = names.iterator();


        while (iterator.hasNext()){ //checks if there is next element to go to: if yes goes to executes code in loops body

            if(iterator.next().equals("Ahmed")){ // this method will move through the elements and return the value
                //equals() -> String method
                iterator.remove(); //remove this element
            }
        }

        return names;

    }


    public static List<String> removeName2(List<String> names){

        names.removeIf(p -> p.equals("Ahmed"));

        return names;

    }

}

/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
 */








