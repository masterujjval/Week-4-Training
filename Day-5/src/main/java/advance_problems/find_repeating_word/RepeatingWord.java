package advance_problems.find_repeating_word;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWord {
    public static void repeatingWord(String txt){
        String regex="\\b\\w+\\b";

        String temp="";
        Set<String>set=new HashSet<>();

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(txt);

        while(matcher.find()){
            if(!(temp.equals(matcher.group()))){
                temp= matcher.group();

            }
            else if(temp.equals(matcher.group())){
                set.add(temp);
            }

        }
        System.out.println(set);

    }
}
