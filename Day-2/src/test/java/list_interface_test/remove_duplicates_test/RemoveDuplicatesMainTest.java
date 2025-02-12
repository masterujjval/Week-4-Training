package list_interface_test.remove_duplicates_test;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicatesMainTest {

@Test
    public void tester(){
    List<Integer> list=new ArrayList<>(Arrays.asList(1,1,1,3,2,3,4,1,4));
    List<Integer>ans=new ArrayList<>();
    for(int i=0;i< list.size();i++){
        if(list.get(i)!=-1){
            ans.add(list.get(i));
        }
        for(int j=i+1;j<list.size();j++){
            if(Objects.equals(list.get(j), list.get(i)))list.set(j,-1);
        }

    }
    List<Integer> checker=new ArrayList<>(Arrays.asList(1,3,2,4));
    Assert.assertEquals(checker,ans);


}

}
