import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        String operation = input.next();

        if (operation.equals("+")) {
            System.out.println(add(first, second));
        } else if (operation.equals("-")) {
            System.out.println(subtract(first, second));
        } else if (operation.equals("*")) {
            System.out.println(multiply(first, second));
        } else if (operation.equals("/")) {
            System.out.println(divide(first, second));
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
