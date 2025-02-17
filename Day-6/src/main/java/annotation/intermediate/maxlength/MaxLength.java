package annotation.intermediate.maxlength;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)  // Make it available at runtime
@Target(ElementType.FIELD)  // Apply it to fields only
public @interface MaxLength {
    int value();  // The max length value to validate
}

