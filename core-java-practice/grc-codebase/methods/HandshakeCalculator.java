import java.util.*;

public class HandshakeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int totalHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The number of possible handshakes is " + totalHandshakes);
    }

    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }
}
