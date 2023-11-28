package week6;

public class Kateryna_Password_Validation {

    public static void main(String[] args) {

        System.out.println(password_Validation("chhIIdeo!23"));

    }

    public static boolean password_Validation(String password) {

        if (password.length() <= 5 || password.contains(" ")) {
            return false;
        }

        int countLC = 0;
        int countUC = 0;
        int countCH = 0;
        int countDg = 0;

        for (char each : password.toCharArray()) {

            if (Character.isLowerCase(each)){
                countLC++;
            } else if (Character.isUpperCase(each)) {
                countUC++;
            } else if (!Character.isLetterOrDigit(each)) {
                countCH++;
            } else if (Character.isDigit(each)) {
                countDg++;
            }

        }

        if(countLC<=0){
            System.out.println("PassWord should at least contain one lowercase letter");
            return false;
        }
        if(countUC<=0){
            System.out.println("PassWord should at least contain one uppercase letter ");
            return false;
        }
        if(countCH<=0){
            System.out.println("Password should at least contain one special characters");
            return false;
        }
        if(countDg<=0){
            System.out.println("Password should at least contains a digit");
            return false;
        }

        return true;

    }

}
