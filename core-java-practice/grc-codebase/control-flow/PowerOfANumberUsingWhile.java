import java.util.*;

public class PowerOfANumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        if (power < 0) {
            System.out.println("Invalid input: power must be non-negative");
            return;
        }
        int anss = 1;
        int cnt = 0;
        while (cnt < power) {
            anss = anss * num;
            cnt++;
        }
        System.out.println(anss);
    }
}
