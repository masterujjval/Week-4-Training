package string_utility_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    // ✅ String Utility Methods
    static class StringUtils {

        // Reverse a String
        public String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        // Check if String is Palindrome
        public boolean isPalindrome(String str) {
            String reversed = reverse(str);
            return str.equalsIgnoreCase(reversed);
        }

        // Convert to Uppercase
        public String toUpperCase(String str) {
            return str.toUpperCase();
        }
    }

    // ✅ Test Cases using JUnit
    StringUtils utils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("olleH", utils.reverse("Hello"));
        assertEquals("321", utils.reverse("123"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("racecar"));
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("JAVA", utils.toUpperCase("java"));
    }
}
