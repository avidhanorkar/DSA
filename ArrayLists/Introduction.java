package ArrayLists;
import java.util.ArrayList;

public class Introduction {
    public static void main(String[] args) {
        // Creation of arraylist
        ArrayList<Integer> newArrList = new ArrayList<>();

        // operations of ArrayLists

        // 1. Add Operation: adds the element in the arraylist
        newArrList.add(1);
        newArrList.add(2);
        newArrList.add(3);
        newArrList.add(4);
        newArrList.add(5);
        System.out.println("Performing the add operation: ");
        System.out.println(newArrList);
        System.out.println();

        // 2. Get Operation: Helps in getting the element at that index
        System.out.println("Performing the get operation: ");
        System.out.println(newArrList.get(4));
        System.out.println();

        // 3. Delete Operation
        newArrList.remove(2);
        System.out.println("Performing the delete operation: ");
        System.out.println(newArrList);
        System.out.println();

        // 4. Set Operation: Helps in updating the element at the specified index
        System.out.println("Performing the set operation: ");
        newArrList.set(0, -4);
        System.out.println(newArrList);
        System.out.println();

        // 5. Contains Element: Helps in checking if the element is present in the Arraylist or not
        System.out.println("Performing the contains operation: ");        
        System.out.println(newArrList.contains(69));
        System.out.println();
    }
}
