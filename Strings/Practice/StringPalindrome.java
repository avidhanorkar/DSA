package Practice;

public class StringPalindrome {

    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        int a = str.length();

        int i = 0;
        int j = a - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "nayan";
        String name2 = "Nayan";
        String name3 = "Avishkar";

        System.out.println(checkPalindrome(name));
        System.out.println(checkPalindrome(name2));
        System.out.println(checkPalindrome(name3));
    }
}
