package basic_problems.validate_license_plate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter license plate: ");
        String license=sc.nextLine();
        if(ValidLicensePlate.validLicensePlate(license)){
            System.out.println("License plate is Valid! ");
        }
        else{
            System.out.println("License plate is Invalid");
        }

    }
}
