package read_a_large_file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadErrorFile {

    public static void readErrorFile(String file){
        try(FileReader f=new FileReader(file)){
            BufferedReader bf=new BufferedReader(f);

            String line;
            while ((line= bf.readLine())!=null){
                if(line.contains("error")){
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
