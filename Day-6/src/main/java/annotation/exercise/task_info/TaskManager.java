package annotation.exercise.task_info;

public class TaskManager {

    @TaskInfo(priority= "high", assignedTo = "Akshit")
    public void completeTask(){
        System.out.println("The task is being completed");
    }

    @TaskInfo(priority= "medium", assignedTo = "Deepak")
    public void availableTask(){
        System.out.println("New task is assigned");
    }

}
