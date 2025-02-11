package smartware_house_management_system;

public class Electronics extends WarehouseItem{
    String brand;
    public Electronics(String name, String brand){
        super(name);
        this.brand=brand;
    }

    @Override
    public void display() {
        System.out.println("Electronic Name: "+getName()+" Brand is: "+brand);
    }
}
