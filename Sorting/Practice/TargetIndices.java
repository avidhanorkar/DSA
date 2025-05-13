package Sorting.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                list.add(i);
            }
        }    
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        List<Integer> list = new ArrayList<>();
        list = targetIndices(arr, 2);
        System.out.println(list);
    }
}
