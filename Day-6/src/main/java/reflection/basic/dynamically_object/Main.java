package reflection.basic.dynamically_object;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?>cls= Example.class;
        Constructor<?> constructor=cls.getDeclaredConstructor(String.class,String.class);

        // now to create object
        Object ob=constructor.newInstance("Ujjwal","There is no tomorrow");

        System.out.println(ob);

    }
}
