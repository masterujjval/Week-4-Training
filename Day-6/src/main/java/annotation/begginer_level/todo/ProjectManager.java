package annotation.begginer_level.todo;


public class ProjectManager {

    // Marking this method as a pending task
    @Todo(task = "Implement User Authentication", assignedTo = "John", priority = "HIGH")
    public void implementAuthFeature() {
        System.out.println("Implementing authentication feature...");
    }

    // Another pending task
    @Todo(task = "Create User Profile", assignedTo = "Alice")
    public void createUserProfile() {
        System.out.println("Creating user profile...");
    }

    // Another pending task with medium priority
    @Todo(task = "Optimize Database Queries", assignedTo = "Bob", priority = "LOW")
    public void optimizeDatabase() {
        System.out.println("Optimizing database queries...");
    }
}
