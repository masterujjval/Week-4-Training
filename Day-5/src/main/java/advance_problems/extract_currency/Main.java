package advance_problems.extract_currency;

public class Main {
    public static void main(String[] args) {
        String txt="The price is $45.99, and the discount is 10.50 and 10";
        ExtractCurrency.extractCurrency(txt);
    }
}
