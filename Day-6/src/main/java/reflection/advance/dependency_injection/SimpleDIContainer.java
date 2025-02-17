package reflection.advance.dependency_injection;

import java.lang.reflect.Field;

public class SimpleDIContainer {
    public static void injectDependencies(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) { // Check if @Inject is present
                field.setAccessible(true); // Private field accessible bana diya
                Object dependency = field.getType().getDeclaredConstructor().newInstance(); // Object create kiya
                field.set(obj, dependency); // Inject kar diya
            }
        }
    }
}
