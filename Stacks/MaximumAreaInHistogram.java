import java.util.Stack;

public class MaximumAreaInHistogram {
    
    public static int maxAreaHistogram(int[] arr) {
        int n = arr.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++){
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                int height = arr[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        
        while (!st.isEmpty()){
            int height = arr[st.pop()];
            int width = st.isEmpty() ? n : n - st.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        
        return maxArea;
    }

    public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};

        int maxArea = maxAreaHistogram(heights);
        System.out.println(maxArea);
    }
}