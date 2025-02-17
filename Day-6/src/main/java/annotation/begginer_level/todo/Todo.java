package annotation.begginer_level.todo;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define @Todo annotation with fields task, assignedTo, and priority
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime for reflection
@Target(ElementType.METHOD)  // Can only be applied to methods
public @interface Todo {
    String task();  // Task description
    String assignedTo();  // Developer responsible for the task
    String priority() default "MEDIUM";  // Default priority is "MEDIUM"
}