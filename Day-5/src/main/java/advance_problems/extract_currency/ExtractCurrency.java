package advance_problems.extract_currency;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {

    public static void extractCurrency(String txt){

        String regex="[0-9]+(\\.[0-9]*)?";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(txt);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }

}
