import java.lang.StringBuilder;
import java.util.*;

public class RemoveDuplicates{

    public static void main (String[] args){
        String s = "hello";
        String ans = removeDuplicatesUsingStringBuilder(s);
        System.out.println(ans);

    }

    static String removeDuplicatesUsingStringBuilder(String s){

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0 ; i < n ; i++ ){
            char ch = s.charAt(i);
            if(!set.contains(ch))
            {   
                sb.append(ch);
                set.add(ch);
        

            }

        }

        return sb.toString();

    }

}