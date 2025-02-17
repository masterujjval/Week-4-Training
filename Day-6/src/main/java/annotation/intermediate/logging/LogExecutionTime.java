package annotation.intermediate.logging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime for reflection
@Target(ElementType.METHOD)  // Can only be applied to methods
public @interface LogExecutionTime {
}
