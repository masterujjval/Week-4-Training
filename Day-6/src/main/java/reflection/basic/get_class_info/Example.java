package reflection.basic.get_class_info;

public class Example {
    String name;
    int age;

    Example(String name, int age){
        this.name=name;
        this.age=age;
    }

    private void getDetails(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }


}
