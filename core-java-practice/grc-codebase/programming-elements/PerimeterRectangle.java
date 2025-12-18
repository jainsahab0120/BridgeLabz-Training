import java.util.*;

public class PerimeterRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double breadth = sc.nextDouble();
        
        double perimeter = 2 * (len + breadth);
        System.out.print("Perimeter of the rectangle: " + perimeter);
    }
}
