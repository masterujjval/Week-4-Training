package crucial_problems.bank_system;

import java.util.*;

public class BankingSystem {

    // HashMap to store customer accounts (AccountNumber -> Balance)
    private Map<String, Double> accountMap;

    // TreeMap to store customers sorted by balance (ascending order)
    private TreeMap<Double, List<String>> sortedAccounts;

    // Queue to handle withdrawal requests
    private Queue<String> withdrawalQueue;

    public BankingSystem() {
        accountMap = new HashMap<>();
        sortedAccounts = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Method to create an account for a customer
    public void createAccount(String accountNumber, double initialBalance) {
        // Store the account and its balance
        accountMap.put(accountNumber, initialBalance);
        updateSortedAccounts(accountNumber, initialBalance);
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        if (accountMap.containsKey(accountNumber)) {
            double currentBalance = accountMap.get(accountNumber);
            double newBalance = currentBalance + amount;
            accountMap.put(accountNumber, newBalance);
            updateSortedAccounts(accountNumber, newBalance);
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        if (accountMap.containsKey(accountNumber)) {
            double currentBalance = accountMap.get(accountNumber);
            if (currentBalance >= amount) {
                double newBalance = currentBalance - amount;
                accountMap.put(accountNumber, newBalance);
                updateSortedAccounts(accountNumber, newBalance);
                System.out.println("Withdrawal successful. New balance: " + newBalance);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        }
    }

    // Method to add withdrawal requests to the queue
    public void requestWithdrawal(String accountNumber) {
        withdrawalQueue.offer(accountNumber);
    }

    // Method to process withdrawal requests from the queue
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            if (accountMap.containsKey(accountNumber)) {
                System.out.println("Processing withdrawal for account: " + accountNumber);
                // In this case, we assume the customer withdraws the full balance
                double balance = accountMap.get(accountNumber);
                accountMap.put(accountNumber, 0.0); // Set balance to 0 after withdrawal
                updateSortedAccounts(accountNumber, 0.0); // Update the TreeMap
                System.out.println("Withdrawal processed. Account " + accountNumber + " balance is now 0.");
            }
        }
    }

    // Helper method to update the sorted accounts map (TreeMap) after a balance change
    private void updateSortedAccounts(String accountNumber, double newBalance) {
        // Remove the old entry if exists
        accountMap.put(accountNumber, newBalance);
        sortedAccounts.values().forEach(list -> list.remove(accountNumber)); // Remove from old balance bucket

        // Add to the new balance bucket
        sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Method to display all customers sorted by their balance
    public void displaySortedByBalance() {
        System.out.println("Customers Sorted by Balance:");
        for (Map.Entry<Double, List<String>> entry : sortedAccounts.entrySet()) {
            for (String accountNumber : entry.getValue()) {
                System.out.println("Account: " + accountNumber + ", Balance: " + entry.getKey());
            }
        }
    }

    // Method to display all accounts and balances
    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Map.Entry<String, Double> entry : accountMap.entrySet()) {
            System.out.println("Account: " + entry.getKey() + ", Balance: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Create customer accounts
        bank.createAccount("A123", 500.00);
        bank.createAccount("B456", 1000.00);
        bank.createAccount("C789", 150.00);

        // Deposit money
        bank.deposit("A123", 200.00);
        bank.deposit("C789", 50.00);

        // Withdraw money
        bank.withdraw("B456", 200.00);
        bank.withdraw("C789", 300.00); // Insufficient funds

        // Request withdrawal
        bank.requestWithdrawal("A123");
        bank.requestWithdrawal("B456");

        // Process all withdrawal requests
        bank.processWithdrawals();

        // Display all accounts and balances
        bank.displayAllAccounts();

        // Display sorted accounts by balance
        bank.displaySortedByBalance();
    }
}
