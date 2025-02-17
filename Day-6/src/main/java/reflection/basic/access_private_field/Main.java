package reflection.basic.access_private_field;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {


        Class<?> cls=PrivateField.class;

        Field field= cls.getDeclaredField("age"); // agr stattic hai then we have to use null or other use object name

        field.setAccessible(true);
        field.set(null,18);

        System.out.println(field.get(null));




    }
}
