package smartware_house_management_system;

import java.util.List;

public class WarehouseUtils {
    public  void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
}