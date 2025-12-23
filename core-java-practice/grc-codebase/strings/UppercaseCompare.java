import java.util.Scanner;

public class UppercaseCompare {

    static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manualUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        boolean same = compareStrings(manualUpper, builtInUpper);

        System.out.println(manualUpper);
        System.out.println(same ? "Both matched" : "Not matched");
    }
}
