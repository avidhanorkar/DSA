package ArrayLists;
import java.util.*;


public class PairSum1 {
    // Time Complexity: O(n^2)
    public static boolean bruteForce(ArrayList<Integer> list, int target){

        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    // Time Complexity: O(n)
    public static void optimizeApproach(ArrayList<Integer> list, int target){
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == target) {
                System.out.println("The target sum can be achieved by adding the elements at the index: " + i + " and " + j );
                return;
            } else if (target < sum){
                j--;
            } else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(bruteForce(list, 5));
        optimizeApproach(list, 5);
    }
}
