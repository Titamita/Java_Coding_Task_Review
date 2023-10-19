package week5;

public class Julia_FindUnique {

    public static void main(String[] args) {

        System.out.println(uniqueChar("AAAABBBBBBBCCCCCCCCCCDEEEEEEF"));

    }

    public static String uniqueChar(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(j) == each){
                    frequency++;
                }
            }

            if(frequency == 1){
                unique += each;
            }
        }
        return unique;

    }
}

