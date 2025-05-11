package Arrays.Practice;

public class MaxConsecOnes {
    public static int maxConsecOnes(int nums[]) {
        int max = 0;
        int ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
            } else if (nums[i] == 0) {
                max = Math.max(max, ones);
                ones = 0;
            }
        }
        max = Math.max(max, ones);

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(maxConsecOnes(arr));
    }
}
