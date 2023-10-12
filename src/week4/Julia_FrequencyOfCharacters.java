package week4;

public class Julia_FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(freqOfChar("aaabbcdd"));

    }

    public static String freqOfChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = "" + str.charAt(i);

            if (!result.contains(ch)) {
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }

                result += ch + count;
            }
        }
        return result;
    }
}
