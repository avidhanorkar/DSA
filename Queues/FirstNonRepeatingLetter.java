import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeatingLetter {
    public static void main(String args[]) {
        int freq[] = new int[26];

        for (int i = 0; i < 26; i++) {
            freq[i] = 0;
        }

        Queue<Character> q = new LinkedList<Character>();
        String str = "aabccxb";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            
            while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove(); 
            }

            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.peek());
            }
        }

    }

}
