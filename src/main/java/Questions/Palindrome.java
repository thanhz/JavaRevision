package Questions;

public class Palindrome {

    public boolean isPalindrome(String s) {
        boolean isSame = true;
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int length = s.length() - 1;
        while (start < length) {
            if (s.charAt(start) == s.charAt(length)) {
                start++;
                length--;
            } else {
                isSame = false;
                break;
            }
        }
        return isSame;
    }

    public boolean isPalindrome2(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) i++;
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
