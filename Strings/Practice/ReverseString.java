package Practice;

public class ReverseString {
    public static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());        
    }

    public static void main(String[] args) {
        reverseString("avishkar");
    }
}
