package list_interface.find_frequency_of_elements;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        // taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many furits you want to enter: ");
        int temp=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<temp;i++){

            System.out.println("Enter fruit to count fruit frequency: ");
            String t=sc.nextLine();
            int count=map.getOrDefault(t,0);
            map.put(t,count+1);
        }

        // iterating over map to see results
        for(Map.Entry<String,Integer>it:map.entrySet()){
            System.out.println(it.getKey()+"-> "+it.getValue());
        }
    }
}
