package checked_exception.read_a_file;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionFile {

    public static void file(String file) throws IOException{
        // without using try catch block


        File ch=new File(file);
        if(!ch.exists()){
            throw new IOException("Caught checked exception: File not found");
        }
        FileReader f=new FileReader(file);
        BufferedReader bf=new BufferedReader(f);
        String line;

        while((line=bf.readLine())!=null){
            System.out.println(line);
        }
        bf.close();

    }
}
