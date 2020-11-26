package String;

import Questions.String.Anagram;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTestSpec {

    @Test
    public void AnagramShouldReturnTrueifStringsAreAnagram(){
        Anagram tester = new Anagram();
        String s1 = "anagram";
        String s2 = "nagaram";
        boolean actual = tester.isAnagram(s1,s2);
        assertTrue(actual);
    }

    @Test
    public void AnagramShouldReturnFalseifStringsAreNotAnagram(){
        Anagram tester = new Anagram();
        String s1 = "rat";
        String s2 = "car";
        boolean actual = tester.isAnagram(s1,s2);
        assertFalse(actual);
    }
    @Test
    public void AnagramShouldReturnFalseifStringscontainsDuplicate(){
        Anagram tester = new Anagram();
        String s1 = "aacc";
        String s2 = "ccac";
        boolean actual = tester.isAnagram(s1,s2);
        assertFalse(actual);
    }
}
