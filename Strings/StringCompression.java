// Que: String Input: "aaabbcccc" Output: "a3b2c4"

package Strings;

public class StringCompression {

    public static void stringCompression(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder(n);
        sb = sb.append(str.charAt(0));

        char curr = sb.charAt(0);
        int repetition = 1;

        for (int i = 0; i < n; i++){
            if (curr == str.charAt(i)){
                repetition++;
            } else {
                curr = str.charAt(i);
                sb.append(repetition);
                sb.append(str.charAt(i));
                repetition = 1;
            }
        }
        sb.append(repetition);
        str = sb.toString();
        System.out.println(str);
    } 

    public static void main(String [] args){
        String a = "aaaabbbbccc";
        stringCompression(a);
    }
}
