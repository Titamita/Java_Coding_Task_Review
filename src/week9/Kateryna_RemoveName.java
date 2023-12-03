package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class Kateryna_RemoveName {

    public static void main(String[] args) {

        ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList("Ahmed", "John", "Lilia", "Ahmed", "Joana", "Kayla", "Mickle", "Ahmed"));
        removeWord(listOfNames);

    }
    public static void removeWord(ArrayList<String> names) {

        // names.removeAll(Arrays.asList("Ahmed"));

        names.removeIf(p -> p.equals("Ahmed"));

        System.out.println(names);

    }

}
