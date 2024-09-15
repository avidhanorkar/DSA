public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        // thought of using binary search for more optimized solution but It cant be used
        // as the array is rotated and the array is no more sorted.

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
        
    }
}
