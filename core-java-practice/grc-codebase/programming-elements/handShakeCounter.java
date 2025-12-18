import java.util.Scanner;

public class HandshakeCounter {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        // Number of students input lena
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Formula use karke maximum handshakes calculate kar rahe hain
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Result 
        System.out.println(
            "The maximum number of handshakes among "
            + numberOfStudents + " students is "
            + totalHandshakes
        );

        
    }
}
