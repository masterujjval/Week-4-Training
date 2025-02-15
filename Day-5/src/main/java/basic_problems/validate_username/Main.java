package basic_problems.validate_username;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        String name=sc.nextLine();
        if(ValidateUserName.validateUsername(name)){
            System.out.println("Username is Valid! ");
        }
        else {
            System.out.println("Username is Invalid! ");
        }
    }
}
