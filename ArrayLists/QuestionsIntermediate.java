package ArrayLists;
import java.util.*;

public class QuestionsIntermediate {
    // Brute Force: Time Complexity = O(n^2) 
    public static int containerwithMostWaterBruteForce(ArrayList<Integer> list){
        int maxArea = 0;
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                int minHt = Math.min(list.get(i), list.get(j)); 
                int area = minHt * (j - i);
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }


    // Optimized Approach: Two pointers
    public static int containerwithMostWater(ArrayList<Integer> list){
        int maxArea = 0;
        int i = 0;
        int j = list.size() - 1;
        while (i <= j){
            int minHt = Math.min(list.get(i), list.get(j));
            int area = minHt * (j - i);
            maxArea = Math.max(maxArea, area);

            // moves the pointer to the shorter line
            if (list.get(i) <= list.get(j)){
                i++;
            } else {
                j--;
            }
        }



        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


        System.out.println("using the brute force: Max Water that can be held is: " + containerwithMostWaterBruteForce(height));
        System.out.println("using the optimized approach: Max Water that can be held is: " +containerwithMostWater(height));
        
    }
}
