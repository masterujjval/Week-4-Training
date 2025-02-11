package multilevel_course_management_system;

public class ExamCourse extends CourseType{

    ExamCourse(String name){
        super(name);
    }
    @Override
    public void getName() {
        System.out.println("The exam course is: ");
    }
}
