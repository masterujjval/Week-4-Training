package annotation.exercise.repeatable_anon;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void main(String[] args) {
        try {
            // Get the class and its methods
            Class<?> clazz = BugTracker.class;

            // Get the method with @BugReport annotations
            Method method = clazz.getMethod("processData");

            // Retrieve the repeatable annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);

                // Print all bug descriptions
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("Bug Description: " + bugReport.description());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
