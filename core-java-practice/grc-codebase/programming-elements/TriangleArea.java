import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = sc.nextDouble();
        
        double area = 0.5 * base * height;

        System.out.println(
            "Area of triangle with base " + base +
            " cm and height " + height +
            " cm is " + area + " square centimeters"
        );
 
    }
}
