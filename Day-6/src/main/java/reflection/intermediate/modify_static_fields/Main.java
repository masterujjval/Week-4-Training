package reflection.intermediate.modify_static_fields;

import java.io.FileReader;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?>cls= Example.class;

        Field field=cls.getDeclaredField("title");
        Field field1= cls.getDeclaredField("rating");

        field1.set(null,9);
        field.set(null,"GTA V");
        Example example = new Example();
        System.out.println(example);

    }
}
