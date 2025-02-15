package extraction_problems.extract_email_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void extraction(String email){
        String regex="[a-zA-Z0-9]+@[A-Za-z]+\\.[a-z]{3}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
