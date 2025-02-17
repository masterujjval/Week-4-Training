package annotation.advance.role_based;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)  // Retain the annotation at runtime
@Target(ElementType.METHOD)  // Apply it to methods
public @interface RoleAllowed {
    String value();  // The role allowed to access the method
}