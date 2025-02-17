package annotation.exercise.suppress_warning;


import java.util.ArrayList;

public class WarningExample {

    @SuppressWarnings("unchecked")
    public void uncheckedWarning() {
        ArrayList list = new ArrayList();  //
        list.add("Java");
        list.add(100);
        list.add(true);

        System.out.println("List elements: " + list);
    }

    public static void main(String[] args) {
        WarningExample example = new WarningExample();
        example.uncheckedWarning();
    }
}
