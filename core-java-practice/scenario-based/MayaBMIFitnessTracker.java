import java.util.*;

public class MayaBMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightOfMaya = sc.nextInt();
        int weightOfMaya = sc.nextInt();
        double bmi = weightOfMaya * 1.0 / (heightOfMaya * heightOfMaya);
        if(bmi <= 18.4) {
            System.out.println("Maya is underweight");
        }
        else if(bmi>=18.4 && bmi<=24.9) {
            System.out.println("Maya is Normal");
        }
        else if(bmi>=25.0 && bmi<=39.9) {
            System.out.println("Maya is Overweight");
        }
    }
}
