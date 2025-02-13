package filehandling;

import java.io.FileNotFoundException;

import static filehandling.FileRead.readFile;
import static filehandling.FileWrite.fileWrite;


public class FIleHandingMain {
    public static void main(String[] args) throws FileNotFoundException {
        String filePathRead="src/main/java/javastreams/filehandling/SampleRead.txt";
        readFile(filePathRead);
        String filePathWrite="src/main/java/javastreams/filehandling/SampleWrite.txt";

        fileWrite(filePathWrite);


    }
}
