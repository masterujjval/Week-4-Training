package list_interface_test.rotate_elements_test;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElementsTest {
    @Test
    public void tester(){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        List<Integer>ans=new ArrayList<>();
        ans.add(5);ans.add(1);ans.add(2);ans.add(3);ans.add(4);

        // rotating list elements


        for(int i=0;i<1;i++){
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
        Assert.assertEquals(ans,list);
    }
}
