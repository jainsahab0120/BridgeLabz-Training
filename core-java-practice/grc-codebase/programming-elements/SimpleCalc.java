import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        // Pehla number user se lena
        System.out.print("Enter first number: ");
        double numA = input.nextDouble();

        // Dusra number user se lena
        System.out.print("Enter second number: ");
        double numB = input.nextDouble();

        // Yaha pe saare operations perform ho rahe hain
        double sumResult = numA + numB;
        double diffResult = numA - numB;
        double mulResult = numA * numB;
        double divResult = numA / numB;

        // Final output ek hi line me show karna
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers "
            + numA + " and " + numB + " is "
            + sumResult + ", " + diffResult + ", " + mulResult + ", and " + divResult
        );

        
    }
}
