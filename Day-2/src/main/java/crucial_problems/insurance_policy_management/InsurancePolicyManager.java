package crucial_problems.insurance_policy_management;


import java.util.*;

public class InsurancePolicyManager {

    Set<Policy> hashSet;
    Set<Policy> linkedHashSet;
    Set<Policy> treeSet;

    public InsurancePolicyManager() {
        hashSet = new HashSet<>();
        linkedHashSet = new LinkedHashSet<>();
        treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));
    }

    // 1. Store Unique Policies
    public void addPolicyToHashSet(Policy policy) {
        hashSet.add(policy);
    }

    public void addPolicyToLinkedHashSet(Policy policy) {
        linkedHashSet.add(policy);
    }

    public void addPolicyToTreeSet(Policy policy) {
        treeSet.add(policy);
    }

    // 2. Retrieve Policies

    // Retrieve all policies (unique)
    public void displayAllPolicies(Set<Policy> set) {
        for (Policy policy : set) {
            System.out.println(policy);
        }
    }

    // Policies expiring within the next 30 days
    public void displayExpiringSoonPolicies(Set<Policy> set) {
        Date currentDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DAY_OF_YEAR, 30);  // 30 days from now
        Date dateIn30Days = cal.getTime();

        for (Policy policy : set) {
            if (policy.getExpiryDate().before(dateIn30Days)) {
                System.out.println(policy);
            }
        }
    }

    // Policies with a specific coverage type
    public void displayPoliciesByCoverageType(Set<Policy> set, String coverageType) {
        for (Policy policy : set) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // Duplicate policies based on policy numbers (find duplicates)
    public void findDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> policyNumbers = new HashSet<>();
        for (Policy policy : hashSet) {
            if (!policyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        System.out.println("Duplicate Policies:");
        for (Policy duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }

    // 3. Performance Comparison
    public void comparePerformance() {
        long startTime, endTime;

        // Performance for HashSet
        startTime = System.nanoTime();
        hashSet.add(new Policy("P1", "Alice", new Date(), "Health", 100.0));
        endTime = System.nanoTime();
        System.out.println("HashSet add operation time: " + (endTime - startTime));

        startTime = System.nanoTime();
        hashSet.contains(new Policy("P1", "Alice", new Date(), "Health", 100.0));
        endTime = System.nanoTime();
        System.out.println("HashSet contains operation time: " + (endTime - startTime));

        // Performance for LinkedHashSet
        startTime = System.nanoTime();
        linkedHashSet.add(new Policy("P2", "Bob", new Date(), "Auto", 150.0));
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add operation time: " + (endTime - startTime));

        startTime = System.nanoTime();
        linkedHashSet.contains(new Policy("P2", "Bob", new Date(), "Auto", 150.0));
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet contains operation time: " + (endTime - startTime));

        // Performance for TreeSet
        startTime = System.nanoTime();
        treeSet.add(new Policy("P3", "Charlie", new Date(), "Home", 200.0));
        endTime = System.nanoTime();
        System.out.println("TreeSet add operation time: " + (endTime - startTime));

        startTime = System.nanoTime();
        treeSet.contains(new Policy("P3", "Charlie", new Date(), "Home", 200.0));
        endTime = System.nanoTime();
        System.out.println("TreeSet contains operation time: " + (endTime - startTime));
    }
}
