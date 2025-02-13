package bufferedstreams;

import java.io.*;

public class EfficientUnbuffer {
    public static long readWriteUsingUnbuffer(String filePath1,String filePath2){
        long start=System.nanoTime();
        try {
            FileInputStream fi=new FileInputStream(filePath1);
            FileOutputStream fo=new FileOutputStream(filePath2);
            int ch;
            while ((ch=fi.read())!=-1){
                fo.write(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return (System.nanoTime()-start);
    }
}
