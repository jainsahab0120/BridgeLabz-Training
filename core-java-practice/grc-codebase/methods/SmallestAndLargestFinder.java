import java.util.*;

public class SmallestAndLargestFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int[] result = findSmallestAndLargest(firstNumber, secondNumber, thirdNumber);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        return new int[]{smallest, largest};
    }
}
