package crucial_problems.voting_system;

import java.util.*;

public class VotingSystem {

    // HashMap to store votes for candidates
    private Map<String, Integer> votesMap;

    // LinkedHashMap to store votes while maintaining the order of insertion
    private LinkedHashMap<String, Integer> linkedVotesMap;

    // TreeMap to store votes in sorted order (by vote count)
    private TreeMap<Integer, List<String>> sortedVotesMap;

    public VotingSystem() {
        votesMap = new HashMap<>();
        linkedVotesMap = new LinkedHashMap<>();
        sortedVotesMap = new TreeMap<>(Collections.reverseOrder()); // Sorted in descending order by vote count
    }

    // Method to cast a vote for a candidate
    public void castVote(String candidate) {
        // Update votes in HashMap and LinkedHashMap
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        linkedVotesMap.put(candidate, votesMap.get(candidate));

        // Update TreeMap by removing the candidate from the previous vote count list
        sortedVotesMap.values().forEach(list -> list.remove(candidate));
        sortedVotesMap.computeIfAbsent(votesMap.get(candidate), k -> new ArrayList<>()).add(candidate);
    }

    // Method to get votes for each candidate
    public void displayVotesInInsertionOrder() {
        System.out.println("Votes in Insertion Order (LinkedHashMap):");
        for (Map.Entry<String, Integer> entry : linkedVotesMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }

    // Method to display votes in sorted order (by vote count)
    public void displayVotesInSortedOrder() {
        System.out.println("Votes in Sorted Order (TreeMap by Vote Count):");
        for (Map.Entry<Integer, List<String>> entry : sortedVotesMap.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + " -> " + entry.getKey() + " votes");
            }
        }
    }

    // Method to get the candidate with the highest votes
    public String getWinner() {
        return votesMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No votes cast");
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes for candidates
        votingSystem.castVote("ujjwal");
        votingSystem.castVote("gupta");
        votingSystem.castVote("ujjwal");
        votingSystem.castVote("akshit");
        votingSystem.castVote("deepak");
        votingSystem.castVote("Bob");

        // Display results in insertion order
        votingSystem.displayVotesInInsertionOrder();

        // Display results in sorted order
        votingSystem.displayVotesInSortedOrder();

        // Display the winner
        System.out.println("Winner: " + votingSystem.getWinner());
    }
}
