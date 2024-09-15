
public class SearchInSortedArray2 {
    public static boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(search(nums, target));
    }
}
