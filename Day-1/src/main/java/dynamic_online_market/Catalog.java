package dynamic_online_market;

public abstract class Catalog {

    String name;
    Catalog(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void display();

}
