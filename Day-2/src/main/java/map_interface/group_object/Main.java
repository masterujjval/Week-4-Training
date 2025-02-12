package map_interface.group_object;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee emp1=new Employee("ujjwal");
        Employee emp2=new Employee("akshit");
        Employee emp3 =new Employee("deepak");
        Employee emp4=new Employee("viraj");
        // Creating deparements
        Department dep1=new Department("IT");
        Department dep2=new Department("AI Engineer");
        Department dep3=new Department("Secops");

        Map<Department, List<Employee>> map=new HashMap<>();

        // adding employees to department
        dep2.addEmp(emp1);
        dep1.addEmp(emp4);
        dep3.addEmp(emp2);
        dep1.addEmp(emp3);

        // adding object to map
        map.put(dep1,dep1.getEmp());
        map.put(dep2,dep2.getEmp());
        map.put(dep3,dep3.getEmp());



//        for(Employee it:list){
//            System.out.println(it.getName());
//        }

        for(Map.Entry<Department, List<Employee>>it:map.entrySet()){

            System.out.println(it.getKey()+" -> "+it.getValue());

        }



    }
}
