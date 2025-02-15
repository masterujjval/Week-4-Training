package advance_problems.valid_ssn;

public class Main {
    public static void main(String[] args) {

        if(ValidateSSN.validateSSN("My SSN is 123-45-6789.")){
            System.out.println("SSN is valid!");
        }
        else{
            System.out.println("SSN is not valid!");
        }
    }
}
