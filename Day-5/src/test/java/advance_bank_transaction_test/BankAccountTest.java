package advance_bank_transaction_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccount {
    private double balance;

    // ✅ Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Balance cannot be negative!");
        this.balance = initialBalance;
    }

    // ✅ Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive!");
        balance += amount;
    }

    // ✅ Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive!");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds!");
        balance -= amount;
    }

    // ✅ Get Balance Method
    public double getBalance() {
        return balance;
    }
}

public class BankAccountTest {

    // ✅ Test: Depositing money
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Balance update failed after deposit!");
    }

    // ✅ Test: Withdrawing money
    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance(), "Balance update failed after withdrawal!");
    }

    // ✅ Test: Withdraw fails for insufficient balance
    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(50);assertThrows(IllegalArgumentException.class, () -> account.withdraw(100), "Should throw exception for insufficient funds!");
    }

    // ✅ Test: Initializing with negative balance should fail
    @Test
    public void testNegativeInitialBalance() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount(-10), "Should throw exception for negative balance!");
    }

    // ✅ Test: Deposit negative amount should fail
    @Test
    public void testDepositNegativeAmount() {BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-20), "Should not allow negative deposits!");
    }

    @Test
    public void testWithdrawNegativeAmount() {BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-20), "Should not allow negative withdrawals!");
    }
}
