package map_interface.group_object;

import java.util.ArrayList;
import java.util.List;

public class Department {

    String name;
    List<Employee>emp;
    Department(String name){
        this.name=name;
        this.emp=new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void addEmp(Employee n){
        emp.add(n);
    }

    public List<Employee> getEmp(){
        return emp;
    }

    @Override
    public String toString(){
        return name;
    }



}
