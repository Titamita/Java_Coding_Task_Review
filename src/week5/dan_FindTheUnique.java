package src.week5;

public class dan_FindTheUnique {
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));
    }
    public static String unique(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Check if the current character is unique
            if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
