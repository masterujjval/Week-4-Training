package set_interface.find_subset;
import java.util.HashSet;
import java.util.Set;

public class SetSubsetCheck {

    // Method to check if set1 is a subset of set2
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }

    public static void main(String[] args) {
        // Example sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Checking if set1 is a subset of set2
        boolean result = isSubset(set1, set2);
        System.out.println("Is Set1 a subset of Set2? " + result); // Output: true
    }
}
