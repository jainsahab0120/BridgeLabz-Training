import java.util.*;

public class SumOfNumbersUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anss = 0.0;
        double x = sc.nextDouble();
        while (x != 0) {
            anss = anss + x;
            x = sc.nextDouble();
        }
        System.out.println(anss);
    }
}
