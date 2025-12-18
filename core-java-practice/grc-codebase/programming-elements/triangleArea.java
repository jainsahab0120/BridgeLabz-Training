import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

         
        Scanner sc = new Scanner(System.in);

        // Base ki value lena
        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();

        // Height ki value lena
        System.out.print("Enter height of triangle in cm: ");
        double height = sc.nextDouble();

        // Triangle ka area calculate kar rahe hain
        double area = 0.5 * base * height;

        // Final result print karna
        System.out.println(
            "Area of triangle with base " + base +
            " cm and height " + height +
            " cm is " + area + " square centimeters"
        );
 
    }
}
