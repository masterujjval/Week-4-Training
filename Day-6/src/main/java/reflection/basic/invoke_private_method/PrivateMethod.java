package reflection.basic.invoke_private_method;

import reflection.basic.access_private_field.PrivateField;

public class PrivateMethod {

    String name;
    PrivateMethod(String name){
        this.name=name;
    }
    private void privateMethod(){
        System.out.println(name);
    }

}
