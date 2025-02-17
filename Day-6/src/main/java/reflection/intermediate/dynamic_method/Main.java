package reflection.intermediate.dynamic_method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        DynamicMethod ob = new DynamicMethod();
        Class<?> cls = ob.getClass();

        // getting methods;
        Method add = cls.getDeclaredMethod("add",int.class,int.class);
        System.out.println("Addition: ");
        add.invoke(ob,89,34);

        Method subs=cls.getDeclaredMethod("subs", int.class, int.class);
        System.out.println("Substraction: ");
        subs.invoke(ob,89,12);

        Method mul= cls.getDeclaredMethod("multi", int.class, int.class);
        System.out.println("Multiplication: ");
        mul.invoke(ob,83,69);



    }
}
