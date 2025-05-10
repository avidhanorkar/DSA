package Practice;

public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int unit = columnNumber % 26;

            char ch =(char)( unit + 'A');
            sb.append(ch);
            columnNumber = columnNumber / 26;
        }    
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28)); // Output: AB
    }
}
