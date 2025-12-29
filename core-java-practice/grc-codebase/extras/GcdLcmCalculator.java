import java.util.*;

public class GcdLcmCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int gcdValue = findGcd(firstNumber, secondNumber);
        int lcmValue = findLcm(firstNumber, secondNumber, gcdValue);

        System.out.println(gcdValue);
        System.out.println(lcmValue);
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
