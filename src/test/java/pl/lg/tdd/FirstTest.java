package pl.lg.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void givenTwoNonZeroNumbers_whenMultiply_thenReturnNonZeroProduct() {
        //Given
        int a = 100;
        int b = 13;
        int expected = 1300;

        First first = new First();
        int result = first.multiply(a, b);

        assertThat(result, is(not(0)));
        assertThat(result, is(expected));

    }

    @Test
    public void givenAnyZero_whenMultiply_thenReturnZero() {
        int a = 0, b = 17, expected = 0;

        First first = new First();
        int result = first.multiply(a, b);

        assertThat(result, is(expected));
    }

    @Test
    public void givenTwoNonEmptyString_whenConcat_thenReturnJoinedString() {
        String a = "a";
        String b = "c";
        String expected = "ac";

        First first = new First();
        String result = first.concatString(a, b);

        assertThat(result, is(expected));
    }

    @Test
    public void givenAnyEmptyString_whenConcat_thenReturnOnlyNotEmpty() {
        String a = "a";
        String empty = "";
        String expected = "a";

        First first = new First();
        String result = first.concatString(a, empty);

        assertThat(result, is(expected));
    }

    @Test
    public void givenAnyNullString_whenConcat_thenReturnDoubleNull() {
        String str1 = null;
        String str2 = null;
        String expected = "nullnull";

        First first = new First();
        String result = first.concatString(str1, str2);

        assertThat(result, is(expected)); //na null-ach - z metody First - metoda first + second przejdzie - bo dwa nulle -
        //łączy te dwa słowa null StringBuilderem - powstaje "nullnull"
    }
}