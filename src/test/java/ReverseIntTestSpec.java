import static org.junit.Assert.*;

import Questions.ReverseInt;
import org.junit.Test;

public class ReverseIntTestSpec {

    @Test
    public void reverseIntShouldReturnReversedInteger() {
        ReverseInt tester = new ReverseInt();
        int actual = tester.reverse(123);
        int expected = 321;
        assertEquals(expected, actual);
    }

    @Test
    public void reverseIntShouldCorrectlyReverseNegativeNumbers() {
        ReverseInt tester = new ReverseInt();
        int actual = tester.reverse(-123);
        int expected = -321;
        assertEquals(expected, actual);
    }
}
