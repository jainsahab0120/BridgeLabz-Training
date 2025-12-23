import java.util.Scanner;

public class CharArrayComparison {

    
    static char[] getCharsManually(String text) {

        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // compare two char arrays
    static boolean compareCharArrays(char[] a, char[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        char[] manualArray = getCharsManually(text);
        char[] builtInArray = text.toCharArray();

        boolean isSame = compareCharArrays(manualArray, builtInArray);

        System.out.print("Charac by user-defined method: ");
        for (char ch : manualArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Are both character arrays same? " + isSame);
    }
}
