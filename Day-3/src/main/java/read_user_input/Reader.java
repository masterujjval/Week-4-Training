package read_user_input;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

    public static void reader(){
        try(BufferedReader bf=new BufferedReader(new FileReader("src/main/java/read_user_input/user_data.txt"))){

            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
