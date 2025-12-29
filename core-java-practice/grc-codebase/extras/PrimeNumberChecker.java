import java.util.*;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean result = isPrime(number);
        System.out.println(result);
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

