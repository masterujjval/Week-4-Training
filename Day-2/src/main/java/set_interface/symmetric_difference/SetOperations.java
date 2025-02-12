package set_interface.symmetric_difference;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    // Method to compute symmetric difference
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDiff = new HashSet<>(set1); // Copy set1
        symmetricDiff.addAll(set2); // Add all elements of set2
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2); // Find common elements (intersection)
        symmetricDiff.removeAll(temp); // Remove common elements from union
        return symmetricDiff;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2)); // Output: {1, 2, 4, 5}
    }
}
