import java.util.*;

public class ReverseTheDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dummy = num;
        int cnt = 0;

        while (dummy != 0) {
            cnt++;
            dummy = dummy / 10;
        }
        int[] digit = new int[cnt];
        int index = 0;

        while (num != 0) {
            digit[index] = num % 10;
            num = num / 10;
            index++;
        }
        int[] ans = new int[cnt];
        int revIndex = 0;

        for (int i = digit.length - 1; i >= 0; i--) {
            ans[revIndex] = digit[i];
            revIndex++;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        
    }
}
