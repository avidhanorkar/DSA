package Strings;
import java.util.*;

public class IntroString {

    public static void main(String[] args) {
        // Strings Declaration
        String name = "Avishkar"; 
        String firstName = new String("Avishkar");// Declaration of String using the String Class
        // Taking input for String
        Scanner sc = new Scanner(System.in);
        String fullName;
        // Even the input is "Avishkar Dhanorkar" the output will be "Avishkar"
        fullName = sc.next(); 
        System.out.println(fullName);
        // .next() is not able to take input for more words. To avoid this we use .nextLine();
        String pooraNaam;
        pooraNaam = sc.nextLine();
        System.out.println(pooraNaam);
        sc.close();


        // String Concatenation
        String a = "Avi";
        String b = "Dhanorkar";
        String c = a + b;// or we can also use concat() function
        String d = a.concat(b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);


        // charAt() Function
        // This function is used to find the character at the specified index in the string
        System.out.println(d.charAt(11));
    }
}