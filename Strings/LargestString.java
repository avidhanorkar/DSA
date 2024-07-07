// Que: To get the largest string from the set of strings lexographically (alphabetically)

package Strings;

public class LargestString {

    public static String largestAndSmallestString (String str[]){
        String largest = str[0];
        String smallest = str[0];

        for (int i = 1; i < str.length; i++){
            if (largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
            if (smallest.compareTo(str[i]) > 0){
                smallest = str[i];
            }
        }

        return largest + " and " + smallest;
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grape", "Pineapple", "Strawberry", "Watermelon", "Kiwi", "Blueberry"};
        System.out.println("The largest and the smallest string is: " + largestAndSmallestString(fruits));
    }
}
