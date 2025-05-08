public class StringComparison {
    public static void main(String[] args) {
        // Checking if the multiple variables of same value of string creates multiple same valued strings in the String Pool 
        // For this we can use "=="

        // "==": Checks the reference equality
        String a = "Avishkar";
        String b = "Avishkar";

        System.out.println(a == b);

        // The print statement prints true: It can be clearly understood that the multiple variables refrencing same string objects are only one string object present in the string pool.
    }    
}
