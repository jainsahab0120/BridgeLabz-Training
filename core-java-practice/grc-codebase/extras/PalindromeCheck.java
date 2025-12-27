import java.util.*;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int left = 0;
        int right = text.length() - 1;
        boolean palindrome = true;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(palindrome);
    }
}
