import java.util.*;

public class TriangularParkRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sideOne = input.nextDouble();
        double sideTwo = input.nextDouble();
        double sideThree = input.nextDouble();

        double rounds = calculateRounds(sideOne, sideTwo, sideThree);

        System.out.println("The athlete must complete " + rounds + " rounds");
    }

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
}
