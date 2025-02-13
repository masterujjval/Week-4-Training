package filterstreams;

import java.io.*;

public class FileWrite {
    public static void fileWriteRead(String path1,String path2){
        try(
            FileReader fr=new FileReader(path1);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(path2);
            BufferedWriter bw=new BufferedWriter(fw);){

                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line.toLowerCase());
                    bw.newLine();

                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
