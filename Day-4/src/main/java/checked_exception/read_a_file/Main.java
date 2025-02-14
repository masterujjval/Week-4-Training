package checked_exception.read_a_file;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try{
            ExceptionFile.file("src/main/java/checked_exception/sample.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
