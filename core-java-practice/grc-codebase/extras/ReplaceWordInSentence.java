import java.util.*;

public class ReplaceWordInSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String oldWord = input.nextLine();
        String newWord = input.nextLine();

        String result = "";
        String current = "";

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                if (current.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += current;
                }
                if (i < sentence.length()) {
                    result += " ";
                }
                current = "";
            } else {
                current += sentence.charAt(i);
            }
        }

        System.out.println(result);
    }
}
