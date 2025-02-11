package multilevel_course_management_system;

public abstract  class CourseType {

    protected String name;
    CourseType(String name){
        this.name=name;
    }
    public abstract void getName();


}
