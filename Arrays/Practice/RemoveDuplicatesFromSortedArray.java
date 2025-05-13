package Arrays.Practice;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicatesFromSortedArray (int nums[]) {
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 4, 5, 5, 6};
        int newLength = removeDuplicatesFromSortedArray(nums);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
