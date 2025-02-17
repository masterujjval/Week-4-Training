package file_handling_test;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessor {

    //   Method to write content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(content);
        writer.close();
    }

    //   Method to read content from a file
    public static String readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();
        return content.toString();
    }
}

public class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";

    //   Test: Writing and Reading from File
    @Test
    public void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, this is a test!";
        FileProcessor.writeToFile(TEST_FILE, content);

        String readContent = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content does not match!");
    }

    //   Test: Check if File Exists after Writing
    @Test
    public void testFileExists() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Test content");
        assertTrue(Files.exists(Paths.get(TEST_FILE)), "File does not exist!");
    }

    //   Test: IOException Handling if File Does Not Exist
    @Test
    public void testIOExceptionForMissingFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    //   Clean up: Delete the test file after running tests
    @AfterEach
    public void cleanUp() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
}
