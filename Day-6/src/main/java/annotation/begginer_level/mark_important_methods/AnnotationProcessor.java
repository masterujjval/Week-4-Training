package annotation.begginer_level.mark_important_methods;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void main(String[] args) {
        try {
            // Get the class and its methods
            Class<?> clazz = TaskManager.class;

            // Get all methods from the TaskManager class
            Method[] methods = clazz.getDeclaredMethods();

            // Iterate over all methods and check for the @ImportantMethod annotation
            for (Method method : methods) {
                // Check if the method is annotated with @ImportantMethod
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    // Retrieve the @ImportantMethod annotation
                    ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);

                    // Print the method name and the importance level
                    System.out.println("Method: " + method.getName() + " - Importance Level: " + importantMethod.level());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
