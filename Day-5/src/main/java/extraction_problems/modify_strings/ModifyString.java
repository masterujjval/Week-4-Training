package extraction_problems.modify_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModifyString {
    public static void modifyString(String str){

        String regex="\\s{2,}";

        StringBuilder ans=new StringBuilder(str);

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(ans);

        while(matcher.find()){
        ans.replace(matcher.start(),matcher.end()," ");
        matcher= pattern.matcher(ans);
        }
        System.out.println("New Modified string is: "+ans);



    }
}
