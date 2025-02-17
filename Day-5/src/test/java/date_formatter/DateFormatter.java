package date_formatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    //   Method to Convert yyyy-MM-dd → dd-MM-yyyy
    public static String formatDate(String inputDate) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        } catch (ParseException e) {
            return "Invalid Date";
        }
    }

    //   JUnit Test Cases
    @Test
    public void testValidDate() {
        assertEquals("15-02-2025", formatDate("2025-02-15"), "Conversion failed for 2025-02-15");
        assertEquals("01-01-2000", formatDate("2000-01-01"), "Conversion failed for 2000-01-01");
    }

    @Test
    public void testInvalidDate() {
        assertEquals("Invalid Date", formatDate("2025-02-30"), "Leap year issue");
        assertEquals("Invalid Date", formatDate("abcd-ef-gh"), "Invalid format issue");
        assertEquals("Invalid Date", formatDate("2025-15-10"), "Wrong month issue");
    }

    //   Manual Testing via Main Method
    public static void main(String[] args) {
        System.out.println("Formatted Date: " + formatDate("2025-02-15"));
        System.out.println("Formatted Date: " + formatDate("2000-01-01"));
        System.out.println("Formatted Date: " + formatDate("2025-02-30"));
    }
}
