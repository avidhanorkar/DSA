package Strings;

public class ToUppercase {

    public static void toUppercase(String a) {
        StringBuilder newStr = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == ' ' && i < a.length()-1) {
                newStr.append(ch);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                newStr.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                newStr.append(ch);
            }
        }

        System.out.println(newStr.toString());
    }

    public static void main(String[] args) {
        String str = "hi, this is the statement, in which you have to make the first letter of the word to be capitalized.";
        toUppercase(str);
    }
}
