package advance_problems.validate_ip_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIpAddress {

    public static boolean validateIP(String ip){

        String regex="(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9]|0)\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9]|0)\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9]|0)\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9]|0)$";

        Pattern pattern=Pattern.compile(regex);

        Matcher matcher=pattern.matcher(ip);
        return matcher.matches();



    }

}
