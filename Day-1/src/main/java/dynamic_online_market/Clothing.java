package dynamic_online_market;

public class Clothing extends Catalog{

    public Clothing(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("The clothing brand is: "+getName());
    }
}
