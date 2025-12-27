import java.util.*;

public class SubstringOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String sub = input.nextLine();

        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            boolean match = true;

            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        System.out.println(count);
    }
}
