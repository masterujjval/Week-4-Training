package extraction_problems.censor_words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorWords {
    public static void censorWords(String str){

        StringBuilder ans=new StringBuilder(str);

        String regex="(bitch)|(damn)|(shithead)|(pique)";

        Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(ans);

        while(matcher.find()){
            int s= matcher.start();
            int end= matcher.end();
            int temp=(end-s);
            String t="";
            while(temp>0){
                t+="*";
                temp--;
            }
            ans.replace(matcher.start(),matcher.end(),t);
            matcher=pattern.matcher(ans);
        }
        System.out.println(ans);


    }
}
