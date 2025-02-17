package reflection.advance.object_mapper;

import java.lang.reflect.Field;
import java.util.*;

public class ObjectMapper {

    public void toObject(Class<?> clazz, Map<Object, List<String>>map) throws NoSuchFieldException, IllegalAccessException {

        // here we have cls and object and also their fields

        // 1 cls and 1 object
        List<String>title=new ArrayList<>(Arrays.asList("GTA V","RDR","Hitman","God of War"));
        List <Integer>rating=new ArrayList<>(Arrays.asList(9,9,8,8));
        int counter=0;

        for(Map.Entry<Object,List<String>>it:map.entrySet()){
            clazz=it.getKey().getClass();
            List<String> list=it.getValue();
            Field field=clazz.getDeclaredField(list.get(0));
            Field field1=clazz.getDeclaredField(list.get(1));

            field.set(it.getKey(),title.get(counter));
            field1.set(it.getKey(),rating.get(counter));
            System.out.println(it.getKey());
            counter++;

        }






    }


}