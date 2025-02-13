package count_words_in_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileReaderUtility {

    public static void reader(String file){
        // creating hashmap
        Map<String,Integer>map=new LinkedHashMap<>();

        // file contains file path

        try(FileReader f= new FileReader(file);){
            BufferedReader bf=new BufferedReader(f);


        String line;

             // for storing string
        while((line= bf.readLine())!=null){
            List<String>temp=new ArrayList<>(Arrays.asList(line.split("\\s+")));

            for(int i=0;i<temp.size();i++) {
                int count = map.getOrDefault(temp.get(i), 0);
                map.put(temp.get(i), count+1);
            }

        }

        for(Map.Entry<String,Integer>it:map.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
