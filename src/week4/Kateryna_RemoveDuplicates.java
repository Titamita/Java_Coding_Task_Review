package week4;

public class Kateryna_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }

    public static String removeDuplicates(String letters) {

        String answer = "";

        for (char each : letters.toCharArray()) {

            if (!(answer.contains("" + each))) {
                answer += "" + each;
            }
        }

        return answer;

    }

}
