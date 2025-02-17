package annotation.intermediate.maxlength;

public class Main {
    public static void main(String[] args) {
        try {
            // This should work because the username is within the limit (5 characters)
            User user1 = new User("John");

            // This should throw an exception because the username exceeds the limit (15 characters)
            User user2 = new User("LongUsername123");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Print the error message if the username is too long
        }
    }
}
