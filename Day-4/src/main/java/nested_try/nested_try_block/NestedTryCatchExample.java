package nested_try.nested_try_block;

import java.util.Scanner;

public class NestedTryCatchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking index and divisor as input
        System.out.print("Enter the index of the array element you want to access: ");
        int index = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            try {
                // access elements at index
                int element = arr[index];


                int result = element / divisor;
                System.out.println("Result of division: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Invalid array index!");
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Cannot divide by zero!");
            }
        } finally {
            System.out.println("Completed the nested try");
            scanner.close();
        }
    }
}
