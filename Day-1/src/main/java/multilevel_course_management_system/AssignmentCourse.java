package multilevel_course_management_system;

public class AssignmentCourse extends CourseType{

    public AssignmentCourse(String name){
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("The assignment course is: "+name);
    }
}
