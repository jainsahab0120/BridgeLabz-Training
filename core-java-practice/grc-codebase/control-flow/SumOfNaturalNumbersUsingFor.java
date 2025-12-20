import java.util.*;

public class SumOfNaturalNumbersUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("The number " + num + " is not a natural number");
            return;
        }
        int ansOfLoop = 0;
        for (int i = 1; i <= num; i++) {
            ansOfLoop += i;
        }
        int ansOfFormula = num * (num + 1) / 2;

        System.out.println("Sum using for loop: " + ansOfLoop);
        System.out.println("Sum using formula: " + ansOfFormula);

        if (ansOfLoop == ansOfFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy in computations.");
        }
    }
}
