package Questions.String;

import java.util.HashMap;
import java.util.Map;

public class ReverseVowels {

    static final String vowels = "aeiouAEIOU";

    public static String reverseVowels(String s) {
        int first = 0, last = s.length() - 1;
        char[] array = s.toCharArray();
        while (first < last) {
            while (first < last && vowels.indexOf(array[first]) == -1) {
                first++;
            }
            while (first < last && vowels.indexOf(array[last]) == -1) {
                last--;
            }
            char temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        return new String(array);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
