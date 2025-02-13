package bufferedstreams;

import static bufferedstreams.EfficientBuffer.readWriteBuffer;
import static bufferedstreams.EfficientUnbuffer.readWriteUsingUnbuffer;

public class EfficientMain {
    public static void main(String[] args) {
        String filePath1="src/main/java/java streams/buffered streams/Sample1.txt";
        String filePath2="src/main/java/java streams/buffered streams/Sample2.txt";
        long bufferTime=readWriteBuffer(filePath1,filePath2);
        long unbufferTime=readWriteUsingUnbuffer(filePath1,filePath2);
        System.out.println("Buffer is faster :- "+(bufferTime<unbufferTime));

    }
}
