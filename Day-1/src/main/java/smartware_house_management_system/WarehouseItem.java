package smartware_house_management_system;

public abstract class WarehouseItem {

    protected String name;
    WarehouseItem(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void display();
}
