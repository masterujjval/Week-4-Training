package data_stream_store;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentData {

    private static final String FILE_NAME = "studentDetails.bin";

    public static void main(String[] args) {
        // Store student details
        storeStudentDetails(1, "Ujjwal", 3.5);
        storeStudentDetails(2, "Deepak", 3.7);
        storeStudentDetails(2, "akshit", 3.7);

        // Retrieve and print student details
        retrieveStudentDetails();
    }

    private static void storeStudentDetails(int rollNumber, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
        } catch (IOException e) {
            System.out.println("Error while storing student details: " + e.getMessage());
        }
    }

    private static void retrieveStudentDetails() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println("------------------------");
            }
        } catch (IOException e) {
            System.out.println("Error while retrieving student details: " + e.getMessage());
        }
    }
}