package Practice;
public class Subsequence {

    public static Boolean subsequence (String str, String key) {
        int found = 0;
        for (int i = 0; i < key.length(); i++) {
            int index = str.indexOf(key.charAt(i), found);
            if (index == -1) {
                return false;
            } else {
                found = index + 1;
            }
        }

        return true;
    }
    public static void main (String args[]) {
        String str = "abcddefghi";
        String key = "adf";

        System.out.println(subsequence(str, key));
        
    }    
}
