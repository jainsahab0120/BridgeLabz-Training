import java.util.*;

public class MultiplicationTableNormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[10];

        for (int i = 1; i <= 10; i++) {
            data[i - 1] = num * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + data[i - 1]);
        }

        
    }
}
