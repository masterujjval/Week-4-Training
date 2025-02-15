package temperature_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverter {

    // ✅ Method to Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // ✅ Method to Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // ✅ JUnit Test Cases
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, celsiusToFahrenheit(0), 0.01, "0°C should be 32°F");
        assertEquals(212.0, celsiusToFahrenheit(100), 0.01, "100°C should be 212°F");
        assertEquals(98.6, celsiusToFahrenheit(37), 0.01, "37°C should be 98.6°F");
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, fahrenheitToCelsius(32), 0.01, "32°F should be 0°C");
        assertEquals(100.0, fahrenheitToCelsius(212), 0.01, "212°F should be 100°C");
        assertEquals(37.0, fahrenheitToCelsius(98.6), 0.01, "98.6°F should be 37°C");
    }

    // ✅ Main Method to Test Manually
    public static void main(String[] args) {
        System.out.println("0°C to Fahrenheit: " + celsiusToFahrenheit(0));
        System.out.println("100°C to Fahrenheit: " + celsiusToFahrenheit(100));
        System.out.println("32°F to Celsius: " + fahrenheitToCelsius(32));
        System.out.println("212°F to Celsius: " + fahrenheitToCelsius(212));
    }
}
