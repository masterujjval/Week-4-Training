package set_interface_test.find_subset_test;

import org.junit.Assert;
import org.junit.Test;
import set_interface.find_subset.SetSubsetCheck;

import java.util.HashSet;
import java.util.Set;

public class SetSubsetCheckTest {

    @Test
    public void testIsSubset() {
        // Create Set1: {2, 3}
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        // Create Set2: {1, 2, 3, 4}
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Assert that Set1 is a subset of Set2
        Assert.assertTrue("Set1 should be a subset of Set2", SetSubsetCheck.isSubset(set1, set2));
    }
}
