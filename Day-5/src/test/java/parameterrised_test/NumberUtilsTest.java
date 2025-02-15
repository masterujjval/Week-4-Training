package parameterrised_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9}) // Multiple test values ints is integer array int[]=ints
    public void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        Assertions.assertEquals(expected, isEven(number), "Failed for number: " + number);
    }
}
