import java.util.*;

public class IsAbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int anss = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                anss = anss + i;
            }
        }
        if (anss > num) {
            System.out.println(num + " is an Abundant Number");
        } else {
            System.out.println(num + " is not an Abundant Number");
        }
    }
}
