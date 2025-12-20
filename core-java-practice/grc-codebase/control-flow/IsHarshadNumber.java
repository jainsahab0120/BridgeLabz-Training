import java.util.*;

public class IsHarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int anss = 0;

        while (num != 0) {
            int digit = num % 10;
            anss = anss + digit;
            num = num / 10;
        }
        if (originalNum % anss == 0) {
            System.out.println(originalNum + " is a Harshad Number");
        } else {
            System.out.println(originalNum + " is not a Harshad Number");
        }
    }
}
