package Strings;

public class PalindromeString {

    public static boolean checkPalindrome(String a){
        int n = a.length();
        for (int i = 0; i < n/2; i++){
            if (a.charAt(i) != a.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrome(str));
    }
}