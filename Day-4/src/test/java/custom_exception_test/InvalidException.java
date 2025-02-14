package custom_exception_test;

import custom_exception.invalid_age.InvalidAge;
import custom_exception.invalid_age.InvalidAgeException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvalidException {
    @Test
    public void tester(){
        InvalidAgeException ex= Assertions.assertThrows(InvalidAgeException.class,()-> InvalidAge.invalidAgeException(12));
        Assertions.assertEquals("Exception: Age is less than 18",ex.getMessage());
    }
}
