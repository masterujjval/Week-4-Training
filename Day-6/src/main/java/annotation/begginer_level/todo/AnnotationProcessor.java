package annotation.begginer_level.todo;



import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void main(String[] args) {
        try {
            // Get the class and its methods
            Class<?> clazz = ProjectManager.class;

            // Get all methods from the ProjectManager class
            Method[] methods = clazz.getDeclaredMethods();

            // Iterate over all methods and check for the @Todo annotation
            for (Method method : methods) {
                // Check if the method is annotated with @Todo
                if (method.isAnnotationPresent(Todo.class)) {
                    // Retrieve the @Todo annotation
                    Todo todo = method.getAnnotation(Todo.class);

                    // Print the task description, assigned developer, and priority
                    System.out.println("Method: " + method.getName());
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
