package reflection.basic.invoke_private_method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        PrivateMethod pm=new PrivateMethod("Ujjwal Gupta");
        Class<?>cls= pm.getClass();
        Method method= cls.getDeclaredMethod("privateMethod");

        method.setAccessible(true);

        // invoking the method
        method.invoke(pm);


    }
}
