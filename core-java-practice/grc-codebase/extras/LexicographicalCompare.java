import java.util.*;

public class LexicographicalCompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();

        int minLength = first.length() < second.length() ? first.length() : second.length();
        boolean decided = false;

        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) < second.charAt(i)) {
                System.out.println(first + " comes before " + second + " in lexicographical order");
                decided = true;
                break;
            } else if (first.charAt(i) > second.charAt(i)) {
                System.out.println(second + " comes before " + first + " in lexicographical order");
                decided = true;
                break;
            }
        }

        if (!decided) {
            if (first.length() < second.length()) {
                System.out.println(first + " comes before " + second + " in lexicographical order");
            } else if (first.length() > second.length()) {
                System.out.println(second + " comes before " + first + " in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}
