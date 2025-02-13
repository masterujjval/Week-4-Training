package filehandling;

import java.io.*;

public class FileRead {
    public static void readFile(String filePath) throws FileNotFoundException {
        try(FileInputStream fi=new FileInputStream(filePath)){
            int ch;
            while((ch=fi.read())!=-1){
                System.out.println((char) ch);
            }
            fi.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
