public class StringCreation {
    public static void main(String[] args) {
        String a = new String("Avishkar");
        String b = "Avishkar";

        System.out.println(a == b); // false

        // here a is created outside the string pool
        // A is created in the heap.
        // b is created inside the string pool.
        // So the print statement gives false
        // To compare only the values of the string variables without there referencing 
        // we can use: ".equals()" method

        System.out.println(a.equals(b)); // true
    }    
}
