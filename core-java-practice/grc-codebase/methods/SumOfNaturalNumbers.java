import java.util.*;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = findSum(n);
        System.out.println(sum);
    }

    public static int findSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}
