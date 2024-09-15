// Needs Optimization
// Brute Force: Insertion Sort O(n2)
// Might use Counting Sort O(n + k)
public class SortColors {
    public static void insertionSortColors(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int prev = i - 1;
            int j = i;
            while (j < arr.length && prev >= 0){
                if (arr[prev] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[prev];
                    arr[prev] = temp;
                    prev --;
                }
                j++;
            }
        }
    }

    public static void countingSortColors(int[] arr){
        int n = arr.length;
        // since max ele is 2 , we can use array of size 2 + 1
        int count[] = new int[3];
        for (int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < 3; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        countingSortColors(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}