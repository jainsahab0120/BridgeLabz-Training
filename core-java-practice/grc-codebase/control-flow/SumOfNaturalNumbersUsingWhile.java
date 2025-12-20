import java.util.*;

public class SumOfNaturalNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("The number " + num + " is not a natural number");
            return;
        }
        int ansOfLoop = 0;
        int i = 1;
        while (i <= num) {
            ansOfLoop += i;
            i++;
        }
        int ansOfFormula = num * (num + 1) / 2;

        System.out.println("Sum using while loop: " + ansOfLoop);
        System.out.println("Sum using formula: " + ansOfFormula);

        if (ansOfLoop == ansOfFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy in computations.");
        }
    }
}
