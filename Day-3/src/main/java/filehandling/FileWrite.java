package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileWrite {
    public static void fileWrite(String filePath){
        File file = new File(filePath);

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println(" File Created: " + filePath);
                } else {
                    return;
                }
            } catch (IOException e) {
                System.out.println(" File Creation Error: " + e.getMessage());
                return;
            }
        }

        try(FileOutputStream fo=new FileOutputStream(file,true)) {
            Scanner sc=new Scanner(System.in);
           String input=sc.nextLine();
           fo.write(input.getBytes(StandardCharsets.UTF_8));
            System.out.println("Written operation successfully executed");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }

