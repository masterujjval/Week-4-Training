package multilevel_course_management_system;

import java.util.List;
import java.util.Objects;

public class Main {

    public static void show(List<? extends CourseType>l){
        for(CourseType list:l){
            list.getName();
        }
    }

    public static void main(String[] args) {
        // creating storage for list
        Course <CourseType>list=new Course<>();

        CourseType ob=new AssignmentCourse("Java generics");
        CourseType ob2=new AssignmentCourse("Python");
        list.addCourse(ob);
        list.addCourse(ob2);

        // now research courses
        CourseType ob3=new ResearchCourse("Psycology");
        CourseType ob4=new ResearchCourse("Human mind");
        list.addCourse(ob3);
        list.addCourse(ob4);

        // calling method to display all course
        show(list.getCourse());

    }



}
