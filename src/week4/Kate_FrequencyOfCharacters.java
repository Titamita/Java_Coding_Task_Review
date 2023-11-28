package week4;

public class Kate_FrequencyOfCharacters {


    public static void main(String[] args) {


        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }




    public static String frequencyOfCharacters(String str){

        String result = "";    //to store finale output


        for(int j = 0; j<str.length();j++) { //outer loop is repeating the inner loop for each character

            char ch = str.charAt(j); //compare;         str.chartAt(0) - 1st character when start from inner loop
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //will go through each letter

                if (str.charAt(i) == ch) { // compare each letter to the 1st letter
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }
            result+=ch+""+count;

        }
        return result;

    }




}
