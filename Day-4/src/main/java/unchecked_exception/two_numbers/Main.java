package unchecked_exception.two_numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input mismatch exception occurs during taking input

        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ExceptionByDivision.divisionByZero(a,b);
        }
        catch (InputMismatchException e){
            System.out.println("Enter integer only ");
        }
    }
}
