package performancetest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

public class PerformanceTest {

    // ✅ Method jo 3 sec tak rukta hai
    public static String longRunningTask() {
        try {
            Thread.sleep(2000); // 2second delay
        } catch (InterruptedException e) {
            e.getMessage();
        }
        return "Completed";
    }

    // ✅ Test jo 2 sec se zyada hone par fail ho jayega
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS) // 2 sec se zyada time nahi lena chahiye
    public void testLongRunningTask() {
        assertEquals("Completed", longRunningTask());
    }
}
