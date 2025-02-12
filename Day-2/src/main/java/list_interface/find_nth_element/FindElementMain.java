package list_interface.find_nth_element;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindElementMain {
    public static void main(String[] args) {

        List<Character>list=new LinkedList<>(Arrays.asList('A','B','C','D','E'));
        int counter=0;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth place to get elementL: ");
        int place=sc.nextInt();
        while(!(list.isEmpty())){
            counter++;
            if(counter==place){
                flag=true;
                System.out.println("The element from last is: "+list.getLast());
            break;
            }
            else{
                list.remove(list.getLast());
            }
        }
        if (!flag) System.out.println("Nth place is out of range");

    }


}
