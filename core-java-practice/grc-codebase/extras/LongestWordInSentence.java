import java.util.*;

public class LongestWordInSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String longest = "";
        String current = "";

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            } else {
                current += sentence.charAt(i);
            }
        }

        System.out.println(longest);
    }
}
