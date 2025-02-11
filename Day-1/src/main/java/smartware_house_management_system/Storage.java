package smartware_house_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

private ArrayList<T> list=new ArrayList<>();

// adding item in the list
    public void addItems(T item){
        list.add(item);
    }

    // get items
    public List<T> getItems(){
        return list;
    }

}
