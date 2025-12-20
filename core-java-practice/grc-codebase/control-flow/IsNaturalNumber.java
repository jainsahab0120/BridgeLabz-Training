import java.util.*;

public class IsNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            int anss = num * (num + 1) / 2;
            System.out.println("The sum of " + num + " natural numbers is " + anss);
        } else {
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
