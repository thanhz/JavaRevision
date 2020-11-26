package Math;

import Questions.Math.RomanToInt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntTestSpec {

    @Test
    public void romanToIntshouldcorrectlyReturnintValueOfRoman() {
        int actual = new RomanToInt().romanToInt("VI");
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void romanToIntshouldDealWithSmallRomanFollowedByBigRoman() {
        int actual = new RomanToInt().romanToInt("IV");
        int expected = 4;

        assertEquals(expected, actual);
    }
}
