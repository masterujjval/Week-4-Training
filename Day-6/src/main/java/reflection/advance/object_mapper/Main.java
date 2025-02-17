package reflection.advance.object_mapper;

import org.ietf.jgss.GSSManager;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Games ob1=new Games();
        Games ob2=new Games();
        Games ob3=new Games();
        Games ob4=new Games();

        // creating clazz of these objects

        Class<?> cls=ob1.getClass();

        Map<Object, List<String>>map=new HashMap<>();
        map.put(ob1, Arrays.asList("title","rating"));
        map.put(ob2, Arrays.asList("title","rating"));
        map.put(ob3, Arrays.asList("title","rating"));
        map.put(ob4, Arrays.asList("title","rating"));

        ObjectMapper ans=new ObjectMapper();
        ans.toObject(cls,map);




    }
}
