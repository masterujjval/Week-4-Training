package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeSerialization{
    private static final String FILE_NAME = "employees.dat";

    // Serialize the list of employees
    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving employees: " + e.getMessage());
        }
    }

    // Deserialize the list of employees
    public static List<Employee> deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while reading employees: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000),
                new Employee(3, "Charlie", "Finance", 55000)
        );

        // Serialize employees
        serializeEmployees(employees);

        // Deserialize and display employees
        List<Employee> retrievedEmployees = deserializeEmployees();
        System.out.println("Retrieved Employees:");
        retrievedEmployees.forEach(System.out::println);
    }

}
