package unchecked_exception_test.two_numbers_test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import unchecked_exception.two_numbers.ExceptionByDivision;

public class exceptionByDivision {
    @Test
    public void tester(){

        ArithmeticException exception= Assert.assertThrows(ArithmeticException.class,()-> ExceptionByDivision.divisionByZero(3,0));
        Assertions.assertEquals("Division by zero not allowed", exception.getMessage());
    }

}
