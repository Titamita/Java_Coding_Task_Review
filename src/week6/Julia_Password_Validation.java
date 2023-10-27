package week6;

public class Julia_Password_Validation {

    public static void main(String[] args) {

        String password1 = "Validp@ssword123";
        String invalid1 = "Baby";
        String invalid2 = "Password invalid";
        String invalid3 = "Validpass1";
        String invalid4 = "Valid#";

        System.out.println("Valid password = " + passwordValid(password1));
        System.out.println(passwordValid(invalid1));
        System.out.println(passwordValid(invalid2));
        System.out.println(passwordValid(invalid3));
        System.out.println(passwordValid(invalid4));

    }

    public static boolean passwordValid(String str){

        if(str.length() < 6 || str.contains(" ") ){
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for(char each : str.toCharArray()){
            if(Character.isUpperCase(each)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(each)){
                hasLowerCase = true;
            }else if(!Character.isLetterOrDigit(each)){
                hasSpecialChar = true;
            }else if(Character.isDigit(each)){
                hasDigit = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
}
