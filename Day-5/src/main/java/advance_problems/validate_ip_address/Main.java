package advance_problems.validate_ip_address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ip address: ");
        String ip=sc.nextLine();
        if(ValidateIpAddress.validateIP(ip)){
            System.out.println("IP address is valid!! ");
        }
        else{
            System.out.println("IP address is not valid!!");
        }
    }
}
