package reflection.advance.json;

import java.lang.reflect.Field;

public class JSON {
    public void helper(Class<?>clazz,Object obj) throws NoSuchFieldException, IllegalAccessException {

        Field field=clazz.getDeclaredField("data");
        Field field1=clazz.getDeclaredField("message");

        String data=(String)field.get(obj);
        String message= (String) field1.get(obj);

        System.out.println(
                "{\n"+data+"\n"+message+
                        "\n}"
        );


    }

}
