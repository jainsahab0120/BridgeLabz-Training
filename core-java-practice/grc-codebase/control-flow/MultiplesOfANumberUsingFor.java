import java.util.*;

public class MultiplesOfANumberUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0 || num >= 100) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 100; i >= 1; i--) {
            
            if (i < 100 && i % num == 0) {
                System.out.println(i);
                continue;
            }
        }
    }
}
