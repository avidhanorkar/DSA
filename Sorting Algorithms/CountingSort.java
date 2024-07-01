public class CountingSort {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]){

        // Finding Max Element
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            maxEle = Math.max(maxEle, arr[i]);
        } 

        // Creating an Array to get the frequency of the element in arr
        int count[] = new int[maxEle + 1];
        for (int i = 0; i < arr.length; i++){
                count[arr[i]] += 1;
        }

        int j = 0;

        for (int i = 0; i < count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i] = count[i] - 1;
            }
        }

    } 

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}
