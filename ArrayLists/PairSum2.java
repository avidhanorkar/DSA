// Pair Sum 2 is same as Pair Sum 1 but the array is sorted and rotated

package ArrayLists;

public class PairSum2 {

    public static String pairSum2(int arr[], int target){
        int breakingPoint = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (!(arr[i] < arr[i+1])){
                breakingPoint = i + 1;
            }
        }

        int i = breakingPoint; // smallest element
        int j = breakingPoint - 1;  // largest element
        while(i != j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return "The target sum: "+ target + ", can be acheived by the sum of elements at the index: " + i + " and " + j + ".";
            } 
            // These following commented code is correct but instead we can achieve circular rotation using: i = (i + 1) % arr.length and similarly for j, j = ( j - 1 + arr.length) % arr.length
            // else if (i == arr.length - 1){
            //     i = 0;
            // } else if (j == 0){
            //     j = arr.length - 1;
            // }
             else if (sum < target){
                i = (i + 1) % arr.length;
            } else {
                j = (j + arr.length - 1) % arr.length;
            }
        }

        return "The target sum cannot be achieved by the elements of the given array!";
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        System.out.println(pairSum2(arr, 16));
        System.out.println(pairSum2(arr, 69));
    }
}
