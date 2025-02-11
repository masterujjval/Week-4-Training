package smartware_house_management_system;

public class Groceries extends WarehouseItem{
    public Groceries(String name){
        super(name);
    }

    @Override
    public void display() {
        System.out.println("grocery name: "+getName());
    }
}
