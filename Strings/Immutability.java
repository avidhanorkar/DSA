public class Immutability {
    public static void main(String[] args) {
        // In Java, the Strings are Immutable.
        String a = "Avishkar"; // A string Object "Avishkar" is created in String Pool
        System.out.println(a);

        a = "Dhanorkar"; 
        System.out.println(a);
        // Here, the value of variable is changed.
        // But the string object "Avishkar" is not changed. Hence, immutable.
        // A new string object "Dhanorkar" is created and the variable a is pointing to it.
        
        // The original string "Avishkar" is still in the String Pool and is not modified.
        // Since String literals are interned, "Avishkar" may remain in memory
        // and is not necessarily garbage collected.

    }
}