package Practice;

public class AppendCharacters {

    public static int appendCharactersToMakeSubstring(String str, String key) {
        int count = 0;
        int foundIndex = 0;

        for (int i = 0; i < key.length(); i++) {
            int index = str.indexOf(key.charAt(i), foundIndex);

            if (index != -1) {
                foundIndex = index + 1;
                count++;
            } else if (index == -1) {
                break;
            }
        }

        return key.length() - count;
    }
    public static void main(String[] args) {
        String str = "z";
        String key = "abcde";


        System.out.println(appendCharactersToMakeSubstring(str, key));
    }
}