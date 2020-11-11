package Questions;

import java.util.*;

public class FindFirstUniqueCharacter {

    public int firstUniqChar(String s) {

        int length = s.length();
        if (length == 0) {
            return -1;
        }
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }

        return -1;
    }
}

/*    Initial Solution
    Map<Character, Boolean> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
        if (map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), false);
        } else {
        map.put(s.charAt(i), true);
        }

        }
        s.lastIndexOf('c');
        char result = Character.MIN_VALUE;

        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
        if (entry.getValue()) {
        result = entry.getKey();
        break;
        }
        }

        return s.indexOf(result);
        }*/
