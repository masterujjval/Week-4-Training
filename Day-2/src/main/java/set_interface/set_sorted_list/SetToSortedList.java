package set_interface.set_sorted_list;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class SetToSortedList {

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Using TreeSet to automatically sort the elements
        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        // Converting TreeSet to List
        return new ArrayList<>(sortedSet);
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> sortedList = convertToSortedList(set);
        System.out.println("Sorted List: " + sortedList); // Output: [1, 3, 5, 9]
    }
}
