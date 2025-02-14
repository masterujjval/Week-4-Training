package custom_exception.invalid_age;

public class Main {
    public static void main(String[] args) {
        try {
            InvalidAge.invalidAgeException(21);
            InvalidAge.invalidAgeException(17);// ⚡ Exception handle in main
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
