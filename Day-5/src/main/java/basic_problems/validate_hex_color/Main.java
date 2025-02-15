package basic_problems.validate_hex_color;

import basic_problems.validate_username.ValidateUserName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hex color value: ");
        String name=sc.nextLine();
        if(ValidateHexColor.validateHexColor(name)){
            System.out.println("Hex color is valid!! ");
        }
        else {
            System.out.println("Hex color is Invalid!!");
        }
    }
}
