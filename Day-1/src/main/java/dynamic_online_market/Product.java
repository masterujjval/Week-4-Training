package dynamic_online_market;

import java.util.ArrayList;
import java.util.List;

public class Product <T extends Catalog> {

List<T>list=new ArrayList<>();

 public void addItem(T item){
     list.add(item);
 }

public List<T> getItem(){
     return list;
}

}
