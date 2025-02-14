package throws_propogation.throws_propogation_catch;

public class Main {
    public static void main(String[] args) {
        try{
            Propogation.propogation(-1,-1,12);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
