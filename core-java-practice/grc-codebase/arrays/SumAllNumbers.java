import java.util.*;

public class SumAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double anss = 0.0;
        int index = 0;
        while (true) {
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            arr[index] = value;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            anss += arr[i];
        }
        System.out.println(anss);

    }
}
