import java.util.*;

public class FestivalLuckyDraw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int number = input.nextInt();

            if (number == -1) {
                break;
            }

            if (number <= 0) {
                continue;
            }

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Gift Won");
            } else {
                System.out.println("No Gift");
            }
        }
    }
}
