import Questions.Palindrome;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTestSpec {

    @Test
    public void IspalindromeShouldReturnTrueifStringsAreAnagram(){
        Palindrome tester = new Palindrome();
        String s1 = "A man, a plan, a canal: Panama";
        boolean actual = tester.isPalindrome(s1);
        assertTrue(actual);
    }

    @Test
    public void IspalindromeShouldReturnFalseifStringsAreNotAnagram(){
        Palindrome tester = new Palindrome();
        String s1 = "race a car";
        boolean actual = tester.isPalindrome(s1);
        assertFalse(actual);
    }
    @Test
    public void IspalindromeShouldReturnFalseifStringsContainsNumber(){
        Palindrome tester = new Palindrome();
        String s1 = "0P";
        boolean actual = tester.isPalindrome(s1);
        assertFalse(actual);
    }
}
