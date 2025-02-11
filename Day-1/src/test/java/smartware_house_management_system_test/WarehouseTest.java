package smartware_house_management_system_test;

import org.junit.Assert;
import org.junit.Test;
import smartware_house_management_system.*;

public class WarehouseTest {
@Test
    public void tester(){
    Storage<WarehouseItem> list = new Storage<>();
    WarehouseItem ob = new Electronics("Asus rog ally", "Asus");
    list.addItems(ob);

    WarehouseItem ob2=new Furniture("Couch","Ikea");
        list.addItems(ob2);

    WarehouseItem ob3=new Groceries("Spinach");
        list.addItems(ob3);

    // now to get items we use wildcards




    Storage<WarehouseItem> list2 = new Storage<>();
    WarehouseItem obj = new Electronics("Asus rog ally", "Asus");
    list2.addItems(ob);

    WarehouseItem obj2=new Furniture("Couch","Ikea");
    list2.addItems(ob2);

    WarehouseItem obj3=new Groceries("Spinach");
    list2.addItems(ob3);

    // now to get items we use wildcards



    Assert.assertEquals(list2.getItems(),list.getItems());

}
}
