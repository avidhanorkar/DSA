import java.util.Queue;
import java.util.LinkedList;

public class Interleave2Halves {

    public void interleave2Halves(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 0; i < size / 2; i++) {
            q1.add(q.peek());
            q.remove();
        }

        while (!q1.isEmpty()) {
            q.add(q1.peek());
            q1.remove();
            q.add(q.peek());
            q.remove();
        }

        // print queue
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 0; i < arr1.length; i++) {
            q1.add(arr1[i]);
        }

        Interleave2Halves interleaver = new Interleave2Halves();
        interleaver.interleave2Halves(q1);
    }
}