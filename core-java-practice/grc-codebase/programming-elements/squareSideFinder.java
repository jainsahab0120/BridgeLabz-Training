import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        // Square ka perimeter input lena
        System.out.print("Enter perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Perimeter ko 4 se divide karke side nikal rahe hain
        double side = perimeter / 4;

        // Final output print karna
        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter
        );

        
    }
}
