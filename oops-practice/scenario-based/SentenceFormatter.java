import java.util.*;

public class SentenceFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(formatText(str));
    }

    public static String formatText(String str) {
        String cleaned = str.trim().replaceAll("\\s+", " ");
        StringBuilder res = new StringBuilder();

        boolean capitalizeNext = true;

        for (int i = 0; i < cleaned.length(); i++) {
            char ch = cleaned.charAt(i);

            if (capitalizeNext && Character.isLetter(ch)) {
                res.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            }
            else {
                res.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
                if (i + 1 < cleaned.length() && cleaned.charAt(i + 1) != ' ') {
                    res.append(' ');
                }
            }
        }

        return res.toString().replaceAll("\\s+", " ").trim();
    }
}
