package list_interface.rotate_elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElements {
    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }

        // rotating list elements
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many times you want to rotate elements: ");
        int rotate= sc.nextInt();

        for(int i=0;i<rotate;i++){
            int f=list.get(0);
            int modify=list.get(0);

            for(int j=1;j<list.size();j++){
                if(j==list.size()-1){
                    list.set(0,list.get(j));
                }
                int temp=list.get(j);
                list.set(j,modify);
               modify=temp;

            }
        }
        System.out.println("List after rotating is: "+list);
    }
}
