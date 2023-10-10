package src.week4;

public class FrequencyOfCaracters {
    public static void main(String[] args) {
        /*
        return method find frequency of chars in a string
         */
        String str= "aaabbbbccc";
        System.out.println(removeDup("aaabbbccc"));
    }
    public static String removeDup(String str){
       String out="";

       for(int i =0;i<str.length();i++){
           if(!out.contains(str.substring(i,i+1))){
               out+=str.substring(i,i+1);
           }
       }
       return out;
    }
}
