package Lesson5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests extends Assert {
    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void test1() {
        assertEquals(
                -3,
                calculator.calculate("-5--2"),
                0.000001
        );
    }
}
