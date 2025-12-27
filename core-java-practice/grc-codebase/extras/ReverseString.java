import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        char[] letters = text.toCharArray();
        int start = 0;
        int end = letters.length - 1;

        while (start < end) {
            char temp = letters[start];
            letters[start] = letters[end];
            letters[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(letters));
    }
}
