import java.util.*;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int qoutient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The Quotient is " + qoutient + " and Reminder is " + remainder + " of two number " + num1 + " and " + num2);
    }
}

