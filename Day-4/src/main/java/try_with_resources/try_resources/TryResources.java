package try_with_resources.try_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {
    public static void tryResource(String file){
        try(FileReader f=new FileReader(file)){
            BufferedReader bf=new BufferedReader(f);
            String line;
            while ((line= bf.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
