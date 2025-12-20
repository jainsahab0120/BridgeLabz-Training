import java.util.*;

public class GreatestFactorOfANumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("No greatest factor exists");
            return;
        }
        int largestFactor = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                largestFactor = i;
                break;
            }
        }
        System.out.println(largestFactor);
    }
}
