package beforeeach_and_aftereach_test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    static class DatabaseConnection {
        private boolean isConnected = false;

        public void connect() {
            isConnected = true;
            System.out.println("Database Connected!");
        }

        public void disconnect() {
            isConnected = false;
            System.out.println("Database Disconnected!");
        }

        public boolean isConnected() {
            return isConnected;
        }
    }

    private DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect(); // Establish connection before each test
    }

    @AfterEach
    public void tearDown() {
        db.disconnect(); // Close connection after each test
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(db.isConnected(), "Database should be connected.");
    }

    @Test
    public void testConnectionIsClosedAfterTest() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected.");
    }
}
