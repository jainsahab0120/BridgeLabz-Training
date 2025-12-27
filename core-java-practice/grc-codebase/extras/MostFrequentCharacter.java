import java.util.*;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int[] freq = new int[256];
        char mostFrequent = text.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println(mostFrequent);
    }
}
