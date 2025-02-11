package multilevel_course_management_system;

public class ResearchCourse extends CourseType{

    public ResearchCourse(String name){
        super(name);
    }

    @Override
    public void getName() {
        System.out.println("The research course is: " +name);
    }
}
