package list_interface.reverse_a_list;
import java.util.*;
import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<5;i++){
            stack.push(list.get(i));
        }
        // now we are reversing the list
        for(int i=0;i<5;i++){
            list.set(i,stack.pop());
        }

        System.out.println("The reversed linked list is: "+list);




    }

}
