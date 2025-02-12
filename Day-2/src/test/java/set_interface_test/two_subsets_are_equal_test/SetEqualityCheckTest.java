package set_interface_test.two_subsets_are_equal_test;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static set_interface.two_subsets_are_equal.SetEqualityCheck.areSetsEqual;

public class SetEqualityCheckTest {
    @Test
    public void tester(){
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        Assert.assertTrue(areSetsEqual(set1, set2));
    }
}
