public class PrettyProgramming {
    public static void main(String[] args) {
        // Example 1: Using printf for formatted output
        System.out.printf("Name: %s, Age: %d, Height: %.2f meters%n", "Alice", 25, 1.68);

        // Example 2: Using String.format to create a formatted string
        String formattedString = String.format("Product: %s, Price: $%.2f, Quantity: %d", "Laptop", 999.99, 3);
        System.out.println(formattedString);

        // Example 3: Pretty printing a table
        System.out.printf("%-15s %-10s %-10s%n", "Name", "Age", "City");
        System.out.printf("%-15s %-10d %-10s%n", "John Doe", 30, "New York");
        System.out.printf("%-15s %-10d %-10s%n", "Jane Smith", 27, "Los Angeles");
        System.out.printf("%-15s %-10d %-10s%n", "Alice Brown", 22, "Chicago");
    }
}