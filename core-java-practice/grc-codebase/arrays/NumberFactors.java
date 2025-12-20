import java.util.*;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] dummy = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        dummy[j] = factors[j];
                    }
                    factors = dummy;
                }
                factors[index] = i;
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }
    }
}
