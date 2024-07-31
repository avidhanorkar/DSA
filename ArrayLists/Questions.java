package ArrayLists;
import java.util.*;
public class Questions {
    
    public static void reversePrint(ArrayList<Integer> list){
        for (int i = list.size() - 1; i >= 0; i-- ){
            System.out.print(list.get(i) + " ");
        }
    }

    public static int maxInList(ArrayList<Integer> list){
        int a = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++){
            a = Math.max(a, list.get(i));
        }

        return a;
    }

    public static void swapNumbersInList(ArrayList<Integer> list, int a, int b){  
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            list.add(i + 1);
        }
        System.out.println("-------------Reverse Print-------------");
        reversePrint(list);
        System.out.println();
        System.out.println("-------------Max in List-------------");
        System.out.println(maxInList(list));
        System.out.println();
        System.out.println("-------------Swap Numbers-------------");
        swapNumbersInList(list, 0, 4);
        System.out.println(list);
        System.out.println();
        System.out.println("-------------Sorting the ArrayList-------------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println();
        System.out.println("-------------Sorting in Descending Order-------------");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        System.out.println();
    }
}
