package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoreTests {

    @Test
    public void absoluteOfMostNegativeValue() {
        final int mostNegative = Integer.MIN_VALUE;
        final int negated = Math.abs(mostNegative);
        assertFalse("No positive equivalent of Integer.MIN_VALUE", negated > 0);
    }

    @Test(expected = NullPointerException.class)
    public void expectNullPointerExceptionToBeThrown() {
        final String s = null;
        final int stringLength = s.length();
    }
}
