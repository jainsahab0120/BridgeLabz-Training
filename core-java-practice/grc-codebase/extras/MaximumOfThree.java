import java.util.*;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        int maximumValue = findMaximum(first, second, third);
        System.out.println(maximumValue);
    }

    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
}

