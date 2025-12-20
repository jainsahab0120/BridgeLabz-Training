import java.util.*;

public class SumOfNumbersUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anss = 0.0;
        while (true) {
            double x = sc.nextDouble();
            if (x <= 0) {
                break;
            }
            anss += x;
        }
        System.out.println(anss);
    }
}
