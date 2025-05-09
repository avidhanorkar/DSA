/**
 * This class provides a method to reverse the words in a given string.
 * 
 * Problem Statement:
 * - Given a string `s`, reverse the order of words in the string.
 * - Words are defined as sequences of non-space characters.
 * - The string may contain multiple spaces, including leading, trailing, 
 *   or multiple spaces between words.
 * - The output should have words separated by a single space, with no 
 *   leading or trailing spaces.
 * 
 * Example:
 * Input: "  Hello   World  "
 * Output: "World Hello"
 * 
 * Input: "  Java   Programming   Language  "
 * Output: "Language Programming Java"
 */
package Practice;

public class ReverseWords {
    // public static void reverseWords(String str) {
    // String[] result = str.split(" ");
    // StringBuilder sb = new StringBuilder();

    // for (int i = result.length - 1; i >= 0; i--) {
    // if (result[i].length() != 0) {sb.append(result[i] + " ");};
    // }

    // System.out.println(sb);
    // }

    public static void reverseWords(String str) {
        StringBuilder sb = new StringBuilder();

        int len = str.length();

        int i = len - 1;
        while (i >= 0) {
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            int j = i;
            while (j >= 0 && str.charAt(j) != ' ') {
                j--;
            }

            if (sb.length() == 0) {
                sb.append(str.substring(j + 1, i + 1));
            } else {
                sb.append(" ");
                sb.append(str.substring(j + 1, i + 1));
            }
            i = j - 1;
        }
        System.out.println(sb);

    }

    public static void main(String args[]) {
        reverseWords("           Hello My      name is     Avishkar Dhanorkar      ");
    }
}
