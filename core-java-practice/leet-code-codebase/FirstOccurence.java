import java.util.*;

public class TwoSum
{   
    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input haystack
        String haystack = sc.nextLine();

        // Input needle
        String needle = sc.nextLine();

        int index = strStr(haystack, needle);

        System.out.println("answer : " + index);
    }

    public static int strStr(String haystack, String needle) {
        int ch = 0;
        int len = needle.length();

        while (ch <= haystack.length() - len) {
            if (haystack.substring(ch, ch + len).equals(needle)) {
                return ch;
            }
            ch++;
        }
        return -1;
    }
}
