package bytearraystream;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Files;

public class ImageReading {
   public static byte[] convertIntoByte(String path){
       File file=new File(path);
       try{
           ByteArrayOutputStream bo=new ByteArrayOutputStream();
           Files.copy(file.toPath(),bo);
           return bo.toByteArray();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }
}
