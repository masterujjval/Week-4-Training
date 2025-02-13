package bytearraystream;

import java.io.*;
import java.nio.file.Files;

public class ImageWriting {

    public static void writeByte(byte[] arr,String path2){
        try{
            ByteArrayInputStream bi=new ByteArrayInputStream(arr);
            FileOutputStream fo=new FileOutputStream(path2);
            byte[] buffer= new byte[1024];
            int byteReads;
            while((byteReads=bi.read(buffer))!=-1){
                fo.write(buffer,0,byteReads);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
