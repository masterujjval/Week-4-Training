package annotation.exercise.repeatable_anon;



import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Container annotation to hold multiple @BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)  // Can be applied to methods
public @interface BugReports {
    BugReport[] value();  // Array to hold multiple @BugReport annotations
}
