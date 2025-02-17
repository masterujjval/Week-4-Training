package reflection.intermediate.modify_static_fields;

public class Example {


    static int rating;
    static String title;

    @Override
    public String toString(){
        return ("Title: "+title+"\nRating: "+rating);
    }


}
