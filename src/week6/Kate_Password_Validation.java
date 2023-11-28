package week6;

public class Kate_Password_Validation {

    public static void main(String[] args) {
        System.out.println(passwordValidation("123"));
        System.out.println(passwordValidation("1 23Q!567"));
        System.out.println(passwordValidation("!Q567"));
        System.out.println(passwordValidation("abcDefg"));
        System.out.println(passwordValidation("1234567"));
        System.out.println(passwordValidation("1234567"));
        System.out.println(passwordValidation("1234567"));
        System.out.println(passwordValidation("1234567"));
        System.out.println(passwordValidation("1F3a!d"));
    }



    public static boolean passwordValidation(String str){

        if(str.length() >= 6 && !(str.contains(" "))){

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;

            for(char each : str.toCharArray()){

                if ( Character.isUpperCase(each) ){
                    hasUppercase = true;
                }else if( Character.isLowerCase(each) ){
                    hasLowercase= true;
                }else if(!Character.isLetterOrDigit(each)){
                    hasSpecialChar = true;
                }else if(Character.isDigit(each)){
                    hasDigit = true;
                }
            }
            return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
        }
        return  false;
    }





}
