package annotation.intermediate.logging;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class LoggingAspect {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Get all methods from the TaskManager class
        Method[] methods = TaskManager.class.getDeclaredMethods();

        for (Method method : methods) {
            // Check if the method has the @LogExecutionTime annotation
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    // Start the timer before method execution
                    long startTime = System.nanoTime();

                    // Invoke the method dynamically
                    method.invoke(taskManager);

                    // End the timer after method execution
                    long endTime = System.nanoTime();

                    // Calculate and print the execution time
                    long duration = endTime - startTime;
                    System.out.println("Method " + method.getName() + " executed in: " + duration + " nanoseconds.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
