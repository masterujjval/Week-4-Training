package exception_propogation.exception_propogation_execution;

public class ExceptionPropagationExample {

    // method1 throws ArithmeticException
    public static void method1() {
        int result = 10/0;  // Throws ArithmeticException
    }

    // method2 calls method1
    public static void method2() {
        method1();  // method2 calls method1, exception propagates
    }

    public static void main(String[] args) {
        try {
            // method2 is called which calls method1
            method2();
        } catch (ArithmeticException e) {
            // Handling exception in main
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}
