import java.util.*;

public class MultiplesOfANumberUsingWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0 || num >= 100) {
            System.out.println("Invalid input");
            return;
        }
        int count = 99;
        while (count >= 1) {

            if (count % num == 0) {
                System.out.println(count);
            }
            count--;
        }
    }
}
