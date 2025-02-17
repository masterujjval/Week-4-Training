package annotation.begginer_level.mark_important_methods;


public class TaskManager {

    // Marking this method as HIGH importance (default)
    @ImportantMethod(level = "HIGH")
    public void performCriticalTask() {
        System.out.println("Performing a critical task...");
    }

    // Marking this method with a MEDIUM level of importance
    @ImportantMethod(level = "MEDIUM")
    public void performRoutineTask() {
        System.out.println("Performing a routine task...");
    }

    // Marking this method as LOW importance
    @ImportantMethod(level = "LOW")
    public void performLowPriorityTask() {
        System.out.println("Performing a low priority task...");
    }
}
