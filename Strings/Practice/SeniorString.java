package Practice;

public class SeniorString {
    public static int numberOfSeniorCitizens(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            Integer age = Integer.parseInt(details[i].substring(11, 13));
            if (age >= 60) {
                count ++;
            }
        }

        return count;
    }
}


