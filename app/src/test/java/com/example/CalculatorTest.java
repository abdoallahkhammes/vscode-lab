package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testCalc() {
        assertEquals(5.0/6.0, calculator.calc(2, 3), 0.0001);
    }

    @Test
    void testCalcOtherValues() {
        assertEquals(1.25, calculator.calc(1, 4), 0.0001);
    }
}
