import java.util.*;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terms = input.nextInt();
        printFibonacci(terms);
    }

    public static void printFibonacci(int count) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

