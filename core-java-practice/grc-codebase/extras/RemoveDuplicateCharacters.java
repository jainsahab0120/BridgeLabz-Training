import java.util.*;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += current;
            }
        }

        System.out.println(result);
    }
}
