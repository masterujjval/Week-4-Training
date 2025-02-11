package smartware_house_management_system;

public class Furniture extends WarehouseItem {
    String brand;
    public Furniture(String name, String brand){
        super(name);
        this.brand=brand;

    }

    @Override
    public void display() {
        System.out.println("Furniture: "+getName()+" Brand: "+brand);
    }
}
