package exception_handling_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    //   Division Class
    static class Calculator {
        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return a / b;
        }
    }

    //   JUnit Test Cases
    Calculator calculator = new Calculator();

    @Test
    public void testDivideValid() {
        assertEquals(5, calculator.divide(10, 2)); // 10 / 2 = 5
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
