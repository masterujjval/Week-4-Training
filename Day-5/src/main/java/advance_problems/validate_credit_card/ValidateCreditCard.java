package advance_problems.validate_credit_card;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {

    public static boolean validate(String credit){

        String regex="4[0-9]{15}";
        String regex2="5[0-9]{15}";

        Pattern pattern= Pattern.compile(regex);
        Pattern pattern2= Pattern.compile(regex2);

        return ((pattern2.matcher(credit).matches())||(pattern.matcher(credit).matches()));



    }

}
