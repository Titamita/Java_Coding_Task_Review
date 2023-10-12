package week4;

public class Julia_RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("aaabbbccc"));

    }

    public static String removeDup(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if(!result.contains("" + each)){
                result += each;
            }
        }
        return result;
    }
}
