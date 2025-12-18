import java.util.Scanner;

public class distanceConverter {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        // Distance input lena
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Feet ko yard me convert kar rahe hain
        double distanceInYards = distanceInFeet / 3;

        // Yards ko miles me convert kar rahe hain
        double distanceInMiles = distanceInYards / 1760;

        // Final output print karna
        System.out.println(
            "Distance in feet is " + distanceInFeet +
            " while in yards is " + distanceInYards +
            " and in miles is " + distanceInMiles
        );

       
    }
}
