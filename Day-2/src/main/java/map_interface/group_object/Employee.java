package map_interface.group_object;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    String name;
    Employee(String name)
    {
       this.name=name;
    }

    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }


}
