import java.util.*;

public class PrintOddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("The number " + num + " is not a natural number");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }
    }
}
