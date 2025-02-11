package aidrivenresumescreeningsystem;

import java.util.ArrayList;

public class Resume <T extends JobRole>{
    ArrayList<T> list =new ArrayList<>();
    public void addItem(T item){
        list.add(item);
    }
    public ArrayList<T> getList(){
        return list;
    }

}
