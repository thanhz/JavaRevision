package Array;

import Questions.Array.RotateArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class RotateArrayTestSpec {

    @Test
    public void rotateArrayShouldCorrectlyRotateArrayByGivenNumber(){
        int [] arr = {1, 2, 3, 4, 5};
        int[] actual = new RotateArray().rotateArray(arr, 3);
        int[] expected = {3,4,5,1,2};
        assertArrayEquals(expected, actual);
    }
}
