package pl.lg.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {

    private MaxValue maxValue;

    @Before
    public void beforeTest() {
        maxValue = new MaxValue();
    }

    @Test
    public void givenAnyArrayCheckBiggestNumberInArray() {

        int [] a = {1, 5, 6, 8, 9, 14, 12};
        int expected = 14;

        int result = MaxValue.largest(a);
        assertEquals(expected, result);
    }

}