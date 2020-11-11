import Questions.FindFirstUniqueCharacter;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstUniqueCharacterTestSpec {

    @Test
    public void firstUniqCharShouldreturn0WhenInputleetcode(){
        FindFirstUniqueCharacter tester = new FindFirstUniqueCharacter();
        String s = "leetcode";
        int actual = tester.firstUniqChar(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void firstUniqCharShouldreturn2WhenInputloveleetcode(){
        FindFirstUniqueCharacter tester = new FindFirstUniqueCharacter();
        String s = "loveleetcode";
        int actual = tester.firstUniqChar(s);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
