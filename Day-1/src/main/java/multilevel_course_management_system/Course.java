package multilevel_course_management_system;

import java.util.ArrayList;
import java.util.List;

public class Course <T extends CourseType> {

    // list to store all catagories of courses
    List<T>list=new ArrayList<>();

    public void addCourse(T item){
        list.add(item);
    }

    public List<T> getCourse(){
        return list;
    }


}
