package week5;

public class Art2String_reverse {

    public static void main(String[] args) {

        String str = "ABCD";
        //            0123

        String reverse = ""; // "avaJ"
        for (int i = str.length() - 1; i >= 0; i--) {  // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }

        System.out.println(reverse);

    }

}
