package serialization;

import java.util.Arrays;
import java.util.List;

import static serialization.EmployeeSerialization.deserializeEmployees;
import static serialization.EmployeeSerialization.serializeEmployees;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Akshit", "HR", 500000),
                new Employee(2, "Deepak", "IT", 60000),
                new Employee(3, "Ujjwal", "Finance", 85000)
        );

        // Serialize employees
        serializeEmployees(employees);

        // Deserialize and display employees
        List<Employee> retrievedEmployees = deserializeEmployees();
        System.out.println("Retrieved Employees:");
        retrievedEmployees.forEach(System.out::println);
    }
}
