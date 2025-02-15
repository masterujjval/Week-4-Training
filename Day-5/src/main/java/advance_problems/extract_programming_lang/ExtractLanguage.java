package advance_problems.extract_programming_lang;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguage {
    public static void extractLang(String txt){

        String regex="(Java|JavaScript|Python|Go)";
        Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Matcher matcher=pattern.matcher(txt);
        while(matcher.find()){
            System.out.print(matcher.group()+", ");
        }


    }
}
