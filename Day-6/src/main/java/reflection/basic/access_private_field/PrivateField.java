package reflection.basic.access_private_field;

public class PrivateField {
    private static int age;
     static int  help=age;
    public static void helper(){

        System.out.println("Age is: "+help);

    }
}
