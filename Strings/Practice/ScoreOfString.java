package Practice;

public class ScoreOfString {

    public int scoreOfString(String s) {
        int score = 0;
        int i = 0;
        while (i < s.length() - 1) {
            int ch1 = (int) s.charAt(i);
            int ch2 = (int) s.charAt(i + 1);
        
            score = score + Math.abs(ch1 - ch2);
            i++;
        }


        return score;
    }

    public static void main(String[] args) {


        String str = "hello";

        
    }
}

