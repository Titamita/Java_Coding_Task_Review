package src.week6;

public class dan_Password_validation {
    public static void main(String[] args) {

        String password = "PassW0Rd#";
        System.out.println(validPassword(password));

    }
        public static boolean validPassword(String str) {

            if (str.length() < 6 || str.contains(" ")) {
                return false;
            }
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;

            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                } else if ("!@#$%^&*()_+-=[]{};':\",.<>?".contains(String.valueOf(c))) {
                    hasSpecialChar = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }
            return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;

        }
}
