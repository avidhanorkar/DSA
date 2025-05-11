package Arrays.Practice;


public class SortedArray{
public static boolean isSorted(int arr[]) {
    int n = arr.length;
    int rotatedIndex = 0;
    int count = 0;

    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            rotatedIndex = i;
            count++;
        }
    }

    // If more than one drop is found, it's not sorted (even if rotated)
    if (count > 1) return false;

    // Now check sortedness considering rotation
    for (int i = 0; i < n - 1; i++) {
        if (arr[(rotatedIndex + i) % n] > arr[(rotatedIndex + i + 1) % n]) {
            return false;
        }
    }

    return true;
}

    public static void main(String[] args) {
        int arr[] = {0,5,1,2};
        System.out.println(isSorted(arr));
    }
}