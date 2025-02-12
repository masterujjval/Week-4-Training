package crucial_problems.insurance_policy_management;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create some policies
        Policy policy1 = new Policy("P1", "Alice", new Date(), "Health", 100.0);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1); // Expiry date 1 month later
        Policy policy2 = new Policy("P2", "Bob", cal.getTime(), "Auto", 150.0);
        cal.add(Calendar.MONTH, 2); // Expiry date 2 months later
        Policy policy3 = new Policy("P3", "Charlie", cal.getTime(), "Home", 200.0);

        // Create the InsurancePolicyManager
        InsurancePolicyManager manager = new InsurancePolicyManager();

        // Add policies to different sets
        manager.addPolicyToHashSet(policy1);
        manager.addPolicyToLinkedHashSet(policy2);
        manager.addPolicyToTreeSet(policy3);

        // Display all policies
        System.out.println("All Policies in HashSet:");
        manager.displayAllPolicies(manager.hashSet);

        System.out.println("\nAll Policies in LinkedHashSet:");
        manager.displayAllPolicies(manager.linkedHashSet);

        System.out.println("\nAll Policies in TreeSet:");
        manager.displayAllPolicies(manager.treeSet);

        // Display expiring policies
        System.out.println("\nPolicies Expiring Soon (within 30 days):");
        manager.displayExpiringSoonPolicies(manager.hashSet);

        // Display policies with a specific coverage type
        System.out.println("\nHealth Coverage Policies:");
        manager.displayPoliciesByCoverageType(manager.hashSet, "Health");

        // Find and display duplicate policies
        System.out.println("\nFinding Duplicate Policies:");
        manager.findDuplicatePolicies();

        // Compare performance
        System.out.println("\nPerformance Comparison:");
        manager.comparePerformance();
    }
}
