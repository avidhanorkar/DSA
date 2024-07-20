public class Recursions{
    public static void PrintNumbersInDecreasingOrder(int n){
        if (n >= 0){
            System.out.print(n + " ");
            n = n-1;
            PrintNumbersInDecreasingOrder(n);
        }
    }

    public static void PrintNumbersInIncreasingOrder(int n) {
        if (n == 1){
            System.out.print(n + " ");
            return;
        } 
        PrintNumbersInIncreasingOrder(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){
        int fact = 1;
        if (n > 0){
            fact = n * factorial(n - 1);
        }
        return fact;
    }

    public static int sum(int n){
        int sum = 0;
        if (n >= 0){
            sum = n + sum(n-1);
        }
        return sum;
    }

    public static int nthFibonacciNum(int n){
        if (n == 0){
            return 0;
        } 
        if (n == 1){
            return 1;
        }
        int Fibn = nthFibonacciNum(n - 1) + nthFibonacciNum(n - 2);
        return Fibn;
    }

    public static boolean sortedArray(int []arr, int i){
        if (i== arr.length -1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }

        return sortedArray(arr, i+1);
    }

    public static int firstOccurence(int arr[], int i, int key){
        if (i == arr.length - 1){
            if (key == arr[i]){
                return i;
            } else{
                return -1;
            }
        }

        if (key == arr[i]){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }

    public static int lastOccurence(int arr[], int i, int key){
        if (i == 0){
            if (key == arr[i]){
                return i;
            } else{
                return -1;
            }
        }

        if (key == arr[i]){
            return i;
        }
        return lastOccurence(arr, i-1, key);
    }

    public static int powers(int n, int power){
        // this has time complexity of O(n)
        int ans = 1;
        if (power == 0){
            ans = ans * 1;
            return ans;
        }
        ans = n * powers(n, power - 1);

        return ans;
    }

    

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(nthFibonacciNum(10));
        int arr[] = {8, 3, 6,5 ,7 ,8, 910 , 69, 69} ;
        System.out.println(sortedArray(arr, 0));
        System.out.println(firstOccurence(arr, 0, 69));
        System.out.println(lastOccurence(arr, arr.length-1, 69));
        System.out.println(powers(2, 10));
    }
}