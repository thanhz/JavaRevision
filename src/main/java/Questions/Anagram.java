package Questions;

import java.util.Arrays;

public class Anagram {
    //N log N
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] temp = s.toCharArray();
        char[] temp2 = t.toCharArray();
        Arrays.sort(temp);
        Arrays.sort(temp2);

        return Arrays.equals(temp, temp2);
    }
}
