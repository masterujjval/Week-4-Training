package extraction_problems.capitalize_words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizeWord {
    public static void capitalize(String str){

        String regex= "[A-Z]+[a-z]+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
