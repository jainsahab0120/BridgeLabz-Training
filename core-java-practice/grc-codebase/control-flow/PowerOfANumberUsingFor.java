import java.util.*;

public class PowerOfANumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        if (num <= 0 || power < 0) {
            System.out.println("Invalid input");
            return;
        }
        int anss = 1;
        for (int i = 1; i <= power; i++) {
            anss = anss * num;
        }
        System.out.println(anss);
    }
}
