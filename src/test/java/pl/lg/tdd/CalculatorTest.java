package pl.lg.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void beforeTest() {
        calculator = new Calculator();
    }

    @Test
    public void givenNumbers_whenDivide_thenReturnDivision() {
        int a = 10;
        int b = 5;
        int expected = 2;

        int result = calculator.divide(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void givenNumbers_whenBoolean_thenReturnWhichNumberIsGreater(){
        int a = 8;
        int b = 8;

        boolean expected = true;

        boolean result = calculator.greater(a, b);
        assertEquals(expected, result);
    }
}