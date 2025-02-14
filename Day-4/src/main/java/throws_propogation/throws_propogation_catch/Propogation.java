package throws_propogation.throws_propogation_catch;

public class Propogation {
    public static void propogation(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount<0 || rate<0)throw new IllegalArgumentException("Amount rate must be positive");
    }
}
