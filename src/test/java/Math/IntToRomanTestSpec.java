package Math;

import Questions.Math.IntToRoman;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntToRomanTestSpec {

    @Test
    public void IntToRomanShouldConvertIntegersThousandsToRomanNumeral() {
        String actual = new IntToRoman().intToRoman(1234);
        String expected = "MCCXXXIV";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void IntToRomanShouldConvertIntegersHundredsToRomanNumeral() {
        String actual = new IntToRoman().intToRoman(234);
        String expected = "CCXXXIV";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void IntToRomanShouldConvertIntegersTensToRomanNumeral() {
        String actual = new IntToRoman().intToRoman(34);
        String expected = "XXXIV";

        Assert.assertEquals(actual, expected);
    }
}
