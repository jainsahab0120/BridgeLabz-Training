import java.lang.StringBuilder ; 



public class ReverseaString{
    public static void main (String[] args){

        String s = "hello";
        String ans = reverseUsingStringBuilder(s);
        System.out.println(ans);

    }
    static String reverseUsingStringBuilder(String s){

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        return sb.toString();

    }
}