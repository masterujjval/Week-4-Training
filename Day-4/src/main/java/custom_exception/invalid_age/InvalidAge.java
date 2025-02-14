package custom_exception.invalid_age;

public class InvalidAge {
    public static void invalidAgeException(int a) throws InvalidAgeException {
        if (a < 18) {
            throw new InvalidAgeException("Exception: Age is less than 18");
        }
        System.out.println("Access Granted!!!");
    }
}
