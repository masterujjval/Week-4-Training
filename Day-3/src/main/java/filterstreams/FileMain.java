package filterstreams;

import static filterstreams.FileWrite.fileWriteRead;

public class FileMain {
    public static void main(String[] args) {
        String inputFile = "src/main/java/filterstreams/Sample1.txt";
        String outputFile = "src/main/java/filterstreams/Sample2.txt";

        fileWriteRead(inputFile, outputFile);
    }
}
