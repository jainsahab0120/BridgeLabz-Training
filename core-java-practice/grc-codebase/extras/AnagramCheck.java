import java.util.*;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();

        if (first.length() != second.length()) {
            System.out.println(false);
            return;
        }

        int[] count = new int[256];

        for (int i = 0; i < first.length(); i++) {
            count[first.charAt(i)]++;
            count[second.charAt(i)]--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
