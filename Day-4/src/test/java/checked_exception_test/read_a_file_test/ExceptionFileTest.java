package checked_exception_test.read_a_file_test;

import java.io.IOException;

import checked_exception.read_a_file.ExceptionFile;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

    class ExceptionFileTest {

        @Test
        void testFileNotFound() {
            // File jo exist nahi karti, uske liye exception ka test
            IOException exception = assertThrows(IOException.class, () -> ExceptionFile.file("file.txt"));
            assertEquals("Caught checked exception: File not found", exception.getMessage());

        }
    }



