
public class NextGreaterElement {
    
    public static int[] nextGreaterElement(int arr[], int n){
        int[] arr1 = new int[5];

        for (int i = 0; i < n - 1; i++){
            int j = i + 1;
            if (arr[i] < arr[j]){
                arr1[i] = arr[j];
                continue;
            } 
            arr1[n - 1] = -1;
        }

        return arr1;
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int n = arr.length;

        int ansArr[] = nextGreaterElement(arr, n);
        for (int i = 0; i < n; i ++){
            System.out.print(ansArr[i] + " ");
        }
        System.out.println();
    }
}
