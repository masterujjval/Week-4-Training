package extraction_problems.extract_dates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static void extractDate(String date){
        String regex="[0-9]{2}/[0-9]{2}/[0-9]{4}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(date);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
