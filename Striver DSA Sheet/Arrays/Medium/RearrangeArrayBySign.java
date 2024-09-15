public class RearrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        int newArr[] = new int[nums.length];
        int posArr[] = new int[nums.length / 2];
        int negArr[] = new int[nums.length / 2];
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) {
                posArr[positive] =  nums[i];
                positive++;
            } else if (nums[i] < 0)  {
                negArr[negative] = nums[i];    
                negative++;
            }
        }
        positive = 0; negative = 0;
        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 0){
                newArr[i] = posArr[positive];
                positive++;
            } else if (i % 2 != 0) {
                newArr[i] = negArr[negative];
                negative++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        RearrangeArrayBySign rearranger = new RearrangeArrayBySign();
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] rearrangedArray = rearranger.rearrangeArray(nums);
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }
    }
}
