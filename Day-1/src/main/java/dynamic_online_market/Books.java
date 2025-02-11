package dynamic_online_market;

public class Books extends Catalog{

    public Books(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Book name: "+getName());
    }
}
