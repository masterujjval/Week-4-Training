package set_interface_test.set_sorted_list_test;
import org.junit.Assert;
import org.junit.Test;
import set_interface.set_sorted_list.SetToSortedList;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetToSortedListTest {

    @Test
    public void testConvertToSortedList() {
        // Create a Set with unordered elements
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Expected sorted list
        List<Integer> expectedSortedList = List.of(1, 3, 5, 9);

        // Call the method to convert set to sorted list
        List<Integer> actualSortedList = SetToSortedList.convertToSortedList(set);

        // Assert that the actual sorted list matches the expected sorted list
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testEmptySet() {
        // Test with an empty set
        Set<Integer> emptySet = new HashSet<>();
        List<Integer> expectedSortedList = List.of(); // Expected empty list

        // Convert empty set to sorted list
        List<Integer> actualSortedList = SetToSortedList.convertToSortedList(emptySet);

        // Assert the result
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }

    @Test
    public void testSingleElementSet() {
        // Test with a set containing a single element
        Set<Integer> set = new HashSet<>();
        set.add(5);
        List<Integer> expectedSortedList = List.of(5);

        // Convert the set to a sorted list
        List<Integer> actualSortedList = SetToSortedList.convertToSortedList(set);

        // Assert that the result is the same as the input
        Assert.assertEquals(expectedSortedList, actualSortedList);
    }
}
