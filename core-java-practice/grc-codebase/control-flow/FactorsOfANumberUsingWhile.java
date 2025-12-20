import java.util.*;

public class FactorsOfANumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("The number " + num + " is not a positive integer");
            return;
        }
        int cnt = 1;
        while (cnt < num) {
            if (num % cnt == 0) {
                System.out.println(cnt);
            }
            cnt++;
        }
    }
}
