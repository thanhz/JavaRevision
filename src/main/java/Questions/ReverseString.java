package Questions;

public class ReverseString {

    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length -1;
        while(first < last){
            char start = s[first];
            s[first] = s[last];
            s[last] = start;
            first++;
            last--;
        }
    }

    public void reverseString2(char[] s) {
        int length = s.length -1;
        for (int i = 0; i < s.length -1; i++) {
            char start = s[i];
            s[i] = s[length];
            s[length] = start;
            i++;
            length--;
        }
    }

}
