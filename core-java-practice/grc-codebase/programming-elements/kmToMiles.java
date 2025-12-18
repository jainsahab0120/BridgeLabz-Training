import java.util.Scanner;
public class kmToMiles {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); 

        double kilometers = sc.nextDouble() ;
        double miles = kilometers * 1.6 ;

        System.out.println(" kilometers in miles is equal to " + miles);

    }
}