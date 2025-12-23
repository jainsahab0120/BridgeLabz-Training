import java.util.Scanner;

public class SubstringComparison {

   
    

    // compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("string: ");
        String text = sc.next();

        System.out.print("start index: ");
        int start = sc.nextInt();

        System.out.print("end index: ");
        int end = sc.nextInt();

        String manualSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean isSame = compareStrings(manualSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings same? " + isSame);
    }

    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
}
