package bytearraystream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import static bytearraystream.ImageReading.convertIntoByte;
import static bytearraystream.ImageWriting.writeByte;

public class ImageMain {
    public static boolean verify(String path1,String path2) throws IOException {
        byte[] image1= Files.readAllBytes(new File(path1).toPath());
        byte[] image2=Files.readAllBytes(new File(path2).toPath());
        return Arrays.equals(image1,image2);
    }
    public static void main(String[] args) throws IOException {
        String path1="src/main/java/javastreams/bytearraystream/img.png";
        String path2="src/main/java/javastreams/bytearraystream/img1.png";
        byte[] imageByte=convertIntoByte(path1);
        writeByte(imageByte,path2);

        System.out.println( verify(path1,path2));
    }
}
