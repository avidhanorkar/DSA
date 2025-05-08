public class StringPerformance {
    // We know that the strings are immutable
    // And everytime when we do something on the strings
    // like "a" + "b" or something like that
    // Instead of updating the existing string (because of string immutability)
    // It creates a new string
    // This is very time consuming and inefficient 
    // to tackle this a new Data Structure is used. 
    // It is StringBuilder
    public static void main(String[] args) {
        // Test using String (immutable)
        long startTime = System.currentTimeMillis();
        String str = "a";
        for (int i = 0; i < 10000; i++) {
            str += "b"; // Each time, a new String object is created (inefficient)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with String: " + (endTime - startTime) + " ms");

        // Test using StringBuilder (mutable and fastest)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 10000; i++) {
            sb.append("b"); // Efficient since it modifies the same object
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");

        // Test using StringBuffer (mutable but thread-safe)
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("a");
        for (int i = 0; i < 10000; i++) {
            sbf.append("b"); // Slightly slower due to synchronization
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ms");
    }
}
