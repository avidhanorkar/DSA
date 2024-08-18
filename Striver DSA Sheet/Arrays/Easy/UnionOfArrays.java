import java.util.ArrayList;

public class UnionOfArrays {
    static class Solution{
    //Function to return a list containing the union of the two arrays.
        public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
            // add your code here
            ArrayList<Integer> list = new ArrayList<>();
            int i = 0; int j = 0;
            while(i < n && j < m){
                if (arr1[i] == arr2[j]){
                    if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                        list.add(arr1[i]);
                    }
                    i++; j++;
                } else if (arr1[i] < arr2[j]){
                    if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                        list.add(arr1[i]);
                    }
                    i++;
                } else if (arr1[i] > arr2[j]){
                    if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                        list.add(arr2[j]);
                    }
                    j++;
                }
            }
            while (i < n){
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } 
            while (j < m){
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }

            return list;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 2, 9, 5};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> result = Solution.findUnion(arr1, arr2, n, m);
        System.out.println(result);
    }
}
