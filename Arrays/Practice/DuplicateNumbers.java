package Arrays.Practice;

public class DuplicateNumbers {

    public static void swap(int a[], int c, int b) {
        int temp = a[c];
        a[c] = a[b];
        a[b] = temp;
    };
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                if (i != nums[i] - 1) {
                    return nums[i];
                }
                i++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {
            3,1,3,4,2
        };

        System.out.println(findDuplicate(arr));
    }
}
