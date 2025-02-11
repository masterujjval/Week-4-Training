package dynamic_online_market;

import java.util.List;

public class CatalogUtils {

    public void displayAll(List<? extends Catalog>list){
        for(Catalog lists:list){
            lists.display();
        }
    }


}
