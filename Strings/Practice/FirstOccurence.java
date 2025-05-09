package Practice;
// 28. Find the Index of the First Occurrence in a String
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.

// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

public class FirstOccurence {
    public static int firstOccurence(String haystack, String needle) {
        return haystack.indexOf(needle);
    }    

    // other way
    public static int firstOccurence1 (String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.substring(i, needleLen + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstOccurence("Avishkar", "Avi"));
        System.out.println(firstOccurence1("Avishkar", "Avi"));
    }
}



