package basic_problems.validate_username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {

    public static boolean validateUsername(String name){

        String regex="^[a-zA-Z][a-zA-Z0-9]+";

        Pattern pattern=Pattern.compile(regex);
      return  pattern.matcher(name).matches();



    }

}
