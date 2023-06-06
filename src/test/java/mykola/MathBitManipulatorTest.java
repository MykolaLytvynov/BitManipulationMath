package mykola;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathBitManipulatorTest {
    MathBitManipulator manipulator = new MathBitManipulator();

    @Test
    @DisplayName("check 15 / 5")
    void divideShouldDivide15by5() {
        assertEquals(manipulator.divide(15, 5), 15/5);
    }

    @Test
    @DisplayName("check negative dividend")
    void divideCheckNegativeDivident() {
        assertEquals(manipulator.divide(-15, 5), -15/5);
    }

    @Test
    @DisplayName("check negative divisor")
    void divideCheckNegativeDivisor() {
        assertEquals(manipulator.divide(15, -5), 15/-5);
    }

    @Test
    @DisplayName("check negative divisor and negative dividend")
    void divideCheckNegativeDivisorAndNegativeDividend() {
        assertEquals(manipulator.divide(-15, -5), -15/-5);
    }

    @Test
    @DisplayName("check min value of Integer in the dividend")
    void divideCheckMinValueOfInteger() {
        assertEquals(manipulator.divide(Integer.MIN_VALUE, 15), Integer.MIN_VALUE/15);
    }

    @Test
    @DisplayName("check max value of Integer in the dividend")
    void divideCheckMaxValueOfInteger() {
        assertEquals(manipulator.divide(Integer.MAX_VALUE, 15), Integer.MAX_VALUE/15);
    }

    @Test
    @DisplayName("check divisor greater than dividend")
    void checkDivisorGreaterThanDividend() {
        assertEquals(manipulator.divide(15, 55), 15/55);
    }

    @Test
    @DisplayName("check devide by zero - should return 0")
    void divideShouldReturnZero() {
        assertEquals(manipulator.divide(15, 0), 0);
    }

    @Test
    @DisplayName("check zero in the dividend")
    void checkZeroInTheDividend() {
        assertEquals(manipulator.divide(0, 115), 0);
    }
}
