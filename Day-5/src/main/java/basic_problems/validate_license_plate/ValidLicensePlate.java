package basic_problems.validate_license_plate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLicensePlate {
    public static boolean validLicensePlate(String name){

        String regex="^[A-Z]{2}[0-9]{4}";
        Pattern pattern=Pattern.compile(regex);
        return pattern.matcher(name).matches();


    }
}
