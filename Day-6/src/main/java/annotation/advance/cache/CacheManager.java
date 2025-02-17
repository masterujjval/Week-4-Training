package annotation.advance.cache;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object getFromCache(String key) {
        return cache.get(key);
    }

    public static void putInCache(String key, Object value) {
        cache.put(key, value);
    }

    // Intercepts method calls, checks cache, and manages results
    public static Object invokeMethodWithCache(Object obj, Method method, Object... args) throws Exception {
        String cacheKey = generateCacheKey(method, args);

        // Check if result is already cached
        Object cachedResult = getFromCache(cacheKey);
        if (cachedResult != null) {
            return cachedResult;
        }

        // Invoke method if not cached
        Object result = method.invoke(obj, args);
        putInCache(cacheKey, result);
        return result;
    }

    // Generate cache key based on method name and arguments
    private static String generateCacheKey(Method method, Object[] args) {
        StringBuilder key = new StringBuilder(method.getName());
        for (Object arg : args) {
            key.append("-").append(arg != null ? arg.toString() : "null");
        }
        return key.toString();
    }
}

