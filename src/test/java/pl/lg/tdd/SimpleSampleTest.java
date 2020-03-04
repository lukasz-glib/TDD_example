package pl.lg.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSampleTest {

    @Test
    public void shouldAddTwoNumbersAndReturnValidResult() {
        int a = 10;
        int b = 20;

        SimpleSample simpleSample = new SimpleSample();
        int result = simpleSample.sum(a, b);

        assertEquals("Dodawanie w Javie przestało działać",30, result); //30 - wartość oczekiwana; result - to wartość testowana
    }
}