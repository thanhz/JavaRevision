package Questions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romans.get(s.charAt(i));

            if (i + 1 < s.length()) {
                int next = romans.get(s.charAt(i + 1));
                if (current >= next) {
                    total += current;
                } else {
                    total += (next - current);
                    i++;
                }
            } else {
                total += current;
            }
        }
        return total;
    }
}
