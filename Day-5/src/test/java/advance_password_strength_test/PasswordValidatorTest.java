package advance_password_strength_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidator {

    // ✅ Method to validate password strength
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false; // At least one uppercase letter
        if (!password.matches(".*\\d.*")) return false; // At least one digit
        return true;
    }
}

public class PasswordValidatorTest {

    // ✅ Test: Valid password
    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongPass1"), "Valid password should return true");
    }

    // ✅ Test: Password too short
    @Test
    public void testShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Short1"), "Password with less than 8 chars should return false");
    }

    // ✅ Test: No uppercase letter
    @Test
    public void testNoUppercase() {
        assertFalse(PasswordValidator.isValidPassword("weakpass1"), "Password without uppercase should return false");
    }

    // ✅ Test: No digit
    @Test
    public void testNoDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitPass"), "Password without digit should return false");
    }

    // ✅ Test: Null password
    @Test
    public void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should return false");
    }
}
