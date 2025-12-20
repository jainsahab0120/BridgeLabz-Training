import java.util.*;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int ans = 0;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            ans = ans + (digit * digit * digit);
            originalNum = originalNum / 10;
        }
        if (ans == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
