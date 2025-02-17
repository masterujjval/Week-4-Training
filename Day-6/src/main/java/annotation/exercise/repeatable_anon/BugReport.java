package annotation.exercise.repeatable_anon;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)

public @interface BugReport {
    String description();
}
