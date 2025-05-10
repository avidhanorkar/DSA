package Practice;

import java.util.Arrays;

public class IsAnagram {

    // This is my brute Force
    // public static boolean isAnagram (String str1, String str2) {
    //     ArrayList<Integer> arr1 = new ArrayList<>();
    //     ArrayList<Integer> arr2 = new ArrayList<>();

    //     for (int i = 0; i < str1.length(); i++) {
    //         arr1.add((int)str1.charAt(i));
    //         arr2.add((int)str2.charAt(i));
    //     }

    //     for (int i = 0; i < arr1.size(); i ++) {
    //         if (!arr2.contains(arr1.get(i))) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }
    
    public static boolean isAnagram (String str1, String str2) {
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1, ch2);
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("aba", "abc"));
    }
}
