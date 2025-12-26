import java.util.*;

public class TrigonometricCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angle = input.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + values[0]);
        System.out.println("Cosine: " + values[1]);
        System.out.println("Tangent: " + values[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }
}
