package list_interface_test.reverse_a_list_test;

import org.junit.Assert;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayListMainTest {

@Test
    public void tester(){
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<5;i++){
        stack.push(list.get(i));
    }
    // now we are reversing the list
    for(int i=0;i<5;i++){
        list.set(i,stack.pop());
    }

    List<Integer>ans=new ArrayList<>();
    ans.add(5); ans.add(4); ans.add(3); ans.add(2); ans.add(1);

    Assert.assertEquals(ans,list);
}

}
