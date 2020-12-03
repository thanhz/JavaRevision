package Math;

import Questions.Math.IsPower3;
import org.junit.Assert;
import org.junit.Test;

public class IsPower3TestSpec {

    @Test
    public void isPower3ShouldReturnTrueIfIntIsPowerOfThree() {
        Boolean actual = new IsPower3().isPowerOfThree(27);

        Assert.assertTrue(actual);
    }

    @Test
    public void isPower3ShouldReturnFalseIfIntIsNotPowerOfThree() {
        Boolean actual = new IsPower3().isPowerOfThree(26);

        Assert.assertFalse(actual);
    }
}
