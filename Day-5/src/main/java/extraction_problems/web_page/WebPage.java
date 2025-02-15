package extraction_problems.web_page;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebPage {
    public static void webPage(String str){
        String regex="(https|http)://(www\\.)?[A-Za-z0-9._-]+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
