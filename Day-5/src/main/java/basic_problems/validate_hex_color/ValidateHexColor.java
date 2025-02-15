package basic_problems.validate_hex_color;

import java.util.regex.Pattern;

public class ValidateHexColor {
   public static boolean validateHexColor(String name){
       String regex= "^#[a-zA-Z]{2}[a-zA-Z0-9]{4}";
       Pattern pattern=Pattern.compile(regex);
       return pattern.matcher(name).matches();
   }
}
