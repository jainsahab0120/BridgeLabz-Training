import java.util.*;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Error");
            return;
        }
        int evenIdx = 0;
        int oddIdx = 0;
        int[] evenArr = new int[num / 2 + 1];
        int[] oddArr = new int[num / 2 + 1];

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenArr[evenIdx] = i;
                evenIdx++;
            }
            else {
                oddArr[oddIdx] = i;
                oddIdx++;
            }
        }
        for (int i = 0; i < oddIdx; i++) {
            System.out.println(oddArr[i]);
        }
        for (int i = 0; i < evenIdx; i++) {
            System.out.println(evenArr[i]);
        }
        
    }
}
