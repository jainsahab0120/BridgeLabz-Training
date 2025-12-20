import java.util.*;

public class CalculatorMadeUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        String operand = sc.next();

        switch (operand) {
            case "+":
                System.out.println("Result = " + (num1 + num2));
                break;

            case "-":
                System.out.println("Result = " + (num1 - num2));
                break;

            case "*":
                System.out.println("Result = " + (num1 * num2));
                break;

            case "/":
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                }
                else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
