package advance_problems.valid_ssn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static boolean validateSSN(String txt){

        String regex="[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(txt);

        if(matcher.find()) {
            System.out.println(matcher.group());
            return true;
        }
        return false;
    }
}
