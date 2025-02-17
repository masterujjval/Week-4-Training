package reflection.intermediate.retrieve_annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // can use for classes, interfaces, abstarct classes

@interface Author{
    String name();
}

@Author(name="Ujjwal Gupta")
 class Annotation {

    private String title;
   Annotation(String title){
       this.title=title;
   }
   @Override
    public String toString(){
       return "Title: "+title;
   }


}
