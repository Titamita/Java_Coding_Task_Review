package week4;

public class Kateryna_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBCDD"));
    }

    public static String removeDuplicates(String letters) {

        String answer = ""; //

        for (char each : letters.toCharArray()) {

            int count = 0;

            for (char eachOther : letters.toCharArray()) {
                if (each == eachOther) {
                    count++;
                }
            }

            if (!(answer.contains("" + each))){
                answer += "" + each + count;
            }
        }

        return answer;

    }
}
