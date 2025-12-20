import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double ans = 0.0;

        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextDouble();
        }
        for (int i = 0; i < height.length; i++) {
            ans += height[i];
        }
        double mean = ans / height.length;
        System.out.println(mean);
    }
}
