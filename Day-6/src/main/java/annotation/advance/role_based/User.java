package annotation.advance.role_based;

import java.lang.reflect.Method;

public class User {

    private String username;
    private String role;

    // Constructor to initialize the user with username and role
    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    // Method with @RoleAllowed annotation
    @RoleAllowed("ADMIN")  // Only accessible to "ADMIN" users
    public void accessAdminPage() {
        System.out.println("Accessing Admin Page");
    }

    // Method to check access based on role
    public void checkAccess(Method method) {
        // Check if the method has @RoleAllowed annotation
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            String allowedRole = roleAllowed.value();

            // If the user role matches the allowed role, grant access
            if (this.role.equalsIgnoreCase(allowedRole)) {
                try {
                    method.invoke(this);  // Invoke the method
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Access Denied! You do not have permission to access this method.");
            }
        } else {
            System.out.println("No Role restriction on this method.");
        }
    }
}
