import java.util.Scanner;

public class heightConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        double heightInCm = sc.nextDouble();

        // Convert cm to inches
        double totalInches = heightInCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;


        System.out.println(
            "Your Height in cm is " + heightInCm +
            " while in feet is " + feet +
            " and inches is " + inches
        );

    }
}
