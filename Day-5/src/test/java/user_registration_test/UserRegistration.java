package user_registration_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistration {

    // ✅ Method to Register User
    public static String registerUser(String username, String email, String password) {
        if (username == null || username.length() < 3) {
            throw new IllegalArgumentException("Invalid username! Must be at least 3 characters.");
        }

        if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid email format!");
        }

        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid password! Must be 8+ characters, 1 uppercase, and 1 digit.");
        }

        return "User Registered Successfully!";
    }

    // ✅ JUnit Test Cases
    @Test
    public void testValidRegistration() {
        assertEquals("User Registered Successfully!", registerUser("JohnDoe", "john@example.com", "Password1"));
        assertEquals("User Registered Successfully!", registerUser("Alice", "alice123@mail.com", "SecurePass9"));
    }

    @Test
    public void testInvalidUsername() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> registerUser("JD", "valid@mail.com", "Password1"));
        assertEquals("Invalid username! Must be at least 3 characters.", ex.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> registerUser("JohnDoe", "invalid-email", "Password1"));
        assertEquals("Invalid email format!", ex.getMessage());
    }

    @Test
    public void testInvalidPassword() {
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> registerUser("JohnDoe", "john@example.com", "pass123"));
        assertEquals("Invalid password! Must be 8+ characters, 1 uppercase, and 1 digit.", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> registerUser("JohnDoe", "john@example.com", "PASSWORD"));
        assertEquals("Invalid password! Must be 8+ characters, 1 uppercase, and 1 digit.", ex2.getMessage());
    }

    // ✅ Manual Testing via Main Method
    public static void main(String[] args) {
        try {
            System.out.println(registerUser("JohnDoe", "john@example.com", "Password1"));  // ✅ Valid
            System.out.println(registerUser("JD", "valid@mail.com", "Password1"));  // ❌ Invalid username
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
