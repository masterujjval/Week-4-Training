package reflection.advance.object_mapper;

import org.w3c.dom.html.HTMLImageElement;

public class Games {
    String title;
    int rating;

    @Override
    public String toString(){
        return ("Title: "+ title+"\nRating: "+rating);
    }


}
