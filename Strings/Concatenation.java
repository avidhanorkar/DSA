public class Concatenation {
    public static void main(String[] args) {
        // Addition of char
        System.out.println('a' + 'b'); // 195
        // This will convert the char into ASCII values and give the sum of their ASCII values
        // here a = 97 and b = 95 => 97 + 95 = 195

        // Addition of Strings
        System.out.println("a" + "b"); // ab
        // This will concatenate the string and give the output as "ab"

        // Addition of Char and number
        System.out.println('a' + 3); // 100
        // a = 97 + 3 => 100

        // Addition of String and an integer
        System.out.println("a" + 3);
        // This will convert the integer into one from the Integer class that will call .toString() method.
        // The final output will be the String
    }
}