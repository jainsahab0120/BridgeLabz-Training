import java.util.*;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result[i] = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                result[i] = (char) (ch + 32);
            } else {
                result[i] = ch;
            }
        }

        System.out.println(new String(result));
    }
}
