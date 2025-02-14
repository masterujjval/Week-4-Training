package unchecked_exception.two_numbers;

public class ExceptionByDivision {
    public static void divisionByZero(int a, int b){
        try{
            if(b==0){
                throw new ArithmeticException("Division by zero not allowed");
            }
            int c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
