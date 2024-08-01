package ArrayLists;
import java.util.ArrayList;

public class MultidimensionArrayList{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++ ){
            ArrayList<Integer> innerList = new ArrayList<>();
            for( int j = 1; j <= 5; j++ ){
                innerList.add(i * j);
            }
            list.add(innerList);
        }
        System.out.println(list);
    }
}