package reflection.basic.get_class_info;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String prefix="reflection.basic.get_class_info.";
            String className = sc.nextLine();

            Class<?> cls = Class.forName(prefix+className);

            // get Fields
            for(Field field: cls.getDeclaredFields()){
                System.out.println("Fields in class: "+field.getName());
            }

            // methods name
            for (Method method: cls.getDeclaredMethods()){
                System.out.println("Methods in class: "+method.getName());
            }

            // constructors

            for(Constructor<?> constructor: cls.getDeclaredConstructors()){
                System.out.println("Constructor in class: "+constructor);

            }


        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
