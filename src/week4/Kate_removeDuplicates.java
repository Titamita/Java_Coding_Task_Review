package week4;

public class Kate_removeDuplicates {


    public static void main(String[] args) {

        System.out.println("removeDuplicate:  AAABBBCCC = " + removeDuplicate("AAABBBCCC"));
        System.out.println(removeDuplicate("orrranngeeeeeeeeee"));
    }




    public static String removeDuplicate(String str){

        String result="";

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            if(!result.contains(""+ch)){
                result+=ch;
            }
        }
        return result;

    }


}
