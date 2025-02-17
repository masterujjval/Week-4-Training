package annotation.exercise.task_info;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?>clazz= TaskManager.class;
        // to get all methods
        for(Method method :clazz.getDeclaredMethods()){
            if(method.isAnnotationPresent(TaskInfo.class)){
                //using annontatoin
                TaskInfo taskInfo=method.getAnnotation(TaskInfo.class);
                System.out.println("Task status: "+method.getName());
                System.out.println("Priority: "+taskInfo.priority());
                System.out.println("Assigned to: "+taskInfo.assignedTo());
                System.out.println();
            }
        }
    }
}
