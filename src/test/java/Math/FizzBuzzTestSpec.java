package Math;

import Questions.Math.FizzBuzz;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTestSpec {

    @Test
    public void FizzBuzzShouldReturnFizzForMultiplesOf3AndBuzzForMultiple5(){
        FizzBuzz tester = new FizzBuzz();
        List<String> expected = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

        assertEquals(expected, tester.fizzBuzz(15));
    }
}
