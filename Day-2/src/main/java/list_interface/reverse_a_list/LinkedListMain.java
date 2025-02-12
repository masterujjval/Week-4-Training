package list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // linkedlist reversing the linkedlist
        List<Integer>ans=new ArrayList<>();
        while(!(list.isEmpty())){
            int temp=list.getLast();
            ans.add(temp);
            list.remove(list.getLast());
        }

        System.out.println("The reverse linkedlist is: "+ans);
    }

}
