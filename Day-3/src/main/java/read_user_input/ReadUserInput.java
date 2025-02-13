package read_user_input;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {

    public static void helper() {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter your name: ");
            String name = bf.readLine();

            System.out.print("Enter your age: ");
            String age = bf.readLine();

            System.out.print("Enter your favourite programming language: ");
            String language = bf.readLine();


            try (FileWriter fw = new FileWriter("src/main/java/read_user_input/user_data.txt")) {
                fw.write("Name: " + name + "\n");
                fw.write("Age: " + age + "\n");
                fw.write("Favorite Programming Language: " + language + "\n");
            }

            System.out.println("User data saved successfully!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
