package bufferedstreams;

import java.io.*;

public class EfficientBuffer {
public static long readWriteBuffer(String filePath1,String filePath2){
    long start=System.nanoTime();
    try {
        BufferedInputStream br=new BufferedInputStream(new FileInputStream(filePath1));
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(filePath2));
        int ch;
        while((ch=br.read())!=-1){
            bo.write((char) ch);
        }
        bo.flush();
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    return (System.nanoTime()-start);
}
}
