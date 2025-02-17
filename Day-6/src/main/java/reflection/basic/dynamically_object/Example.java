package reflection.basic.dynamically_object;

public class Example {
    String name;
    String message;

    Example(String name,String message){
        this.message=message;
        this.name=name;

    }
//  override tostring to output explicitly
    @Override
    public String toString(){
        return ("Name: "+name+"\nMessage: "+message);
    }

}
