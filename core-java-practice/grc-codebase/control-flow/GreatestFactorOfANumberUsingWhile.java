import java.util.*;

public class GreatestFactorOfANumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("No greatest factor exists");
            return;
        }
        int largestFactor = 1;
        int cnt = num - 1;
        while (cnt >= 1) {
            if (num % cnt == 0) {
                largestFactor = cnt;
                break;
            }
            cnt--;
        }
        System.out.println(largestFactor);
    }
}
