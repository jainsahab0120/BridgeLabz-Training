import java.util.*;

public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long result = calculateFactorial(number);
        System.out.println(result);
    }

    public static long calculateFactorial(int value) {
        if (value <= 1) {
            return 1;
        }
        return value * calculateFactorial(value - 1);
    }
}
