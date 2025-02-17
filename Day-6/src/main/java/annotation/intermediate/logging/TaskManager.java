package annotation.intermediate.logging;



public class TaskManager {

    // Apply @LogExecutionTime to measure execution time
    @LogExecutionTime
    public void performTaskA() {
        // Simulate a task
        try {
            Thread.sleep(500);  // Simulate a task taking some time (500ms)
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @LogExecutionTime
    public void performTaskB() {
        // Simulate another task
        try {
            Thread.sleep(300);  // Simulate a task taking some time (300ms)
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
