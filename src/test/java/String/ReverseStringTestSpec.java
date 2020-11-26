package String;

import Questions.String.ReverseString;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTestSpec {

    @Test
    public void RevertStringShouldReturnStringInputInReverse(){
        ReverseString tester = new ReverseString();
        char[] array = new char[]{'h','e','l','l','o'};
        char[] expected = new char[]{'o','l','l','e','h'};
        tester.reverseString(array);
        assertArrayEquals(expected, array);
    }
}
