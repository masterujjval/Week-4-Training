package smartware_house_management_system;

public class Main {
    public static void main(String[] args) {
        Storage<WarehouseItem>list=new Storage<>();
        WarehouseItem ob=new Electronics("Asus rog ally","Asus");
        list.addItems(ob);

        WarehouseItem ob2=new Furniture("Couch","Ikea");
        list.addItems(ob2);

        WarehouseItem ob3=new Groceries("Spinach");
        list.addItems(ob3);

        // now to get items we use wildcards
        WarehouseUtils it=new WarehouseUtils();
        it.displayAllItems(list.getItems());
    }
}
