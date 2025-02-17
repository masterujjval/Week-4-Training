package annotation.advance.cache;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation computation = new ExpensiveComputation();
        Method method = computation.getClass().getMethod("expensiveMethod", int.class);

        // First call, result should be computed
        System.out.println("First call result: " + CacheManager.invokeMethodWithCache(computation, method, 5));

        // Second call, result should be fetched from cache
        System.out.println("Second call result (cached): " + CacheManager.invokeMethodWithCache(computation, method, 5));

        // Third call with different argument
        System.out.println("Third call result: " + CacheManager.invokeMethodWithCache(computation, method, 10));
    }
}
