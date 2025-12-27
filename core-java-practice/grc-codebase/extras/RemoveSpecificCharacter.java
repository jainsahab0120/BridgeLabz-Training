import java.util.*;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        char removeChar = input.nextLine().charAt(0);

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != removeChar) {
                result += text.charAt(i);
            }
        }

        System.out.println(result);
    }
}
