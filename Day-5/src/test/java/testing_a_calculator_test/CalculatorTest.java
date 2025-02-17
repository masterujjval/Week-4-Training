package testing_a_calculator_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    //   Calculator Logic
    static class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return a / b;
        }
    }

    //   Test Cases using JUnit
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(5, 5));
        assertEquals(0, calc.add(-5, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, calc.subtract(5, 5));
        assertEquals(-10, calc.subtract(-5, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(25, calc.multiply(5, 5));
        assertEquals(-25, calc.multiply(-5, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
