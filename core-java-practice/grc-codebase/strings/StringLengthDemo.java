import java.util.Scanner;

public class StringLengthDemo {

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int manualLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtInLength);
    }
}
