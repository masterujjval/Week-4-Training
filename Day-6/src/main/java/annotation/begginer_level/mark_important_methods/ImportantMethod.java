package annotation.begginer_level.mark_important_methods;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define @ImportantMethod annotation with optional level parameter
@Retention(RetentionPolicy.RUNTIME)  // Make it available at runtime for reflection
@Target(ElementType.METHOD)  // Can only be applied to methods
public @interface ImportantMethod {
    String level() default "HIGH";  // Default value is HIGH
}
