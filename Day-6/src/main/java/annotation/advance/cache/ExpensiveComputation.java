package annotation.advance.cache;

public class ExpensiveComputation {

    @CacheResult
    public int expensiveMethod(int num) {
        // Simulate expensive computation
        System.out.println("Performing expensive computation...");
        return num * num;
    }
}

