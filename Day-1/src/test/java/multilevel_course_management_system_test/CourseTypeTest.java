package multilevel_course_management_system_test;

import multilevel_course_management_system.AssignmentCourse;
import multilevel_course_management_system.Course;
import multilevel_course_management_system.CourseType;
import multilevel_course_management_system.ResearchCourse;
import org.junit.Assert;
import org.junit.Test;

public class CourseTypeTest {

    @Test
    public void tester(){
        Course<CourseType> list=new Course<>();

        CourseType ob=new AssignmentCourse("Java generics");
        CourseType ob2=new AssignmentCourse("Python");
        list.addCourse(ob);
        list.addCourse(ob2);

        // now research courses
        CourseType ob3=new ResearchCourse("Psycology");
        CourseType ob4=new ResearchCourse("Human mind");
        list.addCourse(ob3);
        list.addCourse(ob4);

        // list two for compare
        Course <CourseType>list2=new Course<>();

        CourseType ob5=new AssignmentCourse("Java generics");
        CourseType ob6=new AssignmentCourse("Python");
        list2.addCourse(ob5);
        list2.addCourse(ob6);

        // now research courses
        CourseType ob7=new ResearchCourse("Psycology");
        CourseType ob8=new ResearchCourse("Human mind");
        list2.addCourse(ob7);
        list2.addCourse(ob8);


        Assert.assertEquals(list.getCourse().contains("python"),list2.getCourse().contains("Python"));

    }



}
