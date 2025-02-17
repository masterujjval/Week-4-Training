package annotation.advance.role_based;


import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        // Create User objects with different roles
        User adminUser = new User("Alice", "ADMIN");
        User regularUser = new User("Bob", "USER");

        // Get the method to check access
        Method adminMethod = User.class.getMethod("accessAdminPage");

        // Try to access the method with both users
        System.out.println("Admin trying to access:");
        adminUser.checkAccess(adminMethod);  // Should allow access

        System.out.println("\nRegular user trying to access:");
        regularUser.checkAccess(adminMethod);  // Should deny access
    }
}
