package pl.lg.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @Before
    public void beforeTest() {
        calculator = new SimpleCalculator();
    }


    @Test
    public void givenAnyTwoNumbers_whenAdd_thenReturnSum(){
        int a = 10;
        int b = 7;
        int expected = 17;

        int result = calculator.add(a, b); //dzięki dodaniu polu i konstruktora - nie muszę za każdym razem nowego obiektu tworzyć

        assertEquals(expected, result);

    }

    @Test
    public void giveAnyPositiveNumbers_whenAdd_thenReturnSum() {
        int a = 10;
        int b = 8;
        int expected = 18;

        int result = calculator.addPositive(a, b); //metoda addPositive - do sprawdzenia liczb dodatnich

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class) //dodać to - bo masz -13; pomijamy wyjątek
    public void givenAnyNegativeNumber_whenAdd_thenExpectException() {
        int a = -13;
        int b = 8;

        calculator.addPositive(a, b);
    }

    @Test
    public void givenAnyZeroAndPositiveNumber_whenAdd_thenReturnSum() {
        int a = 0;
        int b = 17;
        int expected = 17;

        int result = calculator.addPositive(a, b);

        assertEquals(expected, result);


//        public int addPositve(int x, int y) {
//            if (x <= 0 || y <= 0) {
//                throw new IllegalArgumentException("Only positive");
//            } else {
//                return x + y;
//            }
//        }
    }
}