import java.util.*;

public class LargestAndSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] dig = new int[maxDigit];
        int index = 0;

        while (num != 0 && index < maxDigit) {
            dig[index] = num % 10;
            num = num / 10;
            index++;
        }
        int largestNo = 0;
        int secondLargestNo = 0;
        for (int i = 0; i < index; i++) {
            if (dig[i] > largestNo) {
                secondLargestNo = largestNo;
                largestNo = dig[i];
            }
            else if (dig[i] > secondLargestNo && dig[i] != largestNo) {
                secondLargestNo = dig[i];
            }
        }
        System.out.println(largestNo);
        System.out.println(secondLargestNo);

    }
}
