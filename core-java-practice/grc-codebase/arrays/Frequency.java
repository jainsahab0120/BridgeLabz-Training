import java.util.*;

public class Frequency {
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
        dummy = num;
        for (int i = 0; i < cnt; i++) {
            digit[i] = dummy % 10;
            dummy = dummy / 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < digit.length; i++) {
            frequency[digit[i]]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " " + frequency[i]);
            }
        }


    }
}
