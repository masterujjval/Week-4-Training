package reflection.advance.measure_time;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> clazz= MethodC.class;
        Object obj=clazz.getDeclaredConstructor().newInstance();
        Method method=obj.getClass().getDeclaredMethod("fast");

        long st=System.nanoTime();
        method.invoke(obj);
        long end=System.nanoTime();
        System.out.println("Time taken: "+(end-st));


    }
}
